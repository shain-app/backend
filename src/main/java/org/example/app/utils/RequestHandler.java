package org.example.app.utils;

import com.fasterxml.jackson.databind.ObjectMapper; // Import Jackson's ObjectMapper
import java.io.*;
import java.net.*;

import org.example.app.api.ApiGateway;
import org.example.app.model.Item;
import org.example.app.service.ItemService;

public class RequestHandler {

    private final ApiGateway apiGateway;
    private final ObjectMapper objectMapper;

    public RequestHandler(ItemService itemService) {
        this.apiGateway = new ApiGateway(itemService);
        this.objectMapper = new ObjectMapper();
    }

    public void runApp() {
        try (ServerSocket serverSocket = new ServerSocket(8080)) {
            System.out.println("Server is running on port 8080");

            while (true) {
                handleClient(serverSocket.accept());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void handleClient(Socket clientSocket) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
             PrintWriter output = new PrintWriter(clientSocket.getOutputStream(), true)) {

            String requestLine = reader.readLine();
            if (requestLine != null) {
                if (requestLine.startsWith("GET /items")) {
                    Integer id = extractIdFromRequest(requestLine);
                    try {
                        Item item = apiGateway.getItem(id);
                        sendJsonResponse(output, item);
                        System.out.println("Item: " + item + " sent successfully");
                    } catch(IndexOutOfBoundsException e) {
                        sendJsonResponse(output, "Item not found");
                        System.out.println("Item with id " + id + " not found in database!");
                    }
                } else if (requestLine.startsWith("POST /add-item")) {
                    Item newItem = extractItemFromRequest(reader);
                    // boolean success = shainApi.addItem(newItem);
                    // sendJsonResponse(out, success ? "Item added" : "Failed to add item");
                } else {
                    output.println("HTTP/1.1 404 Not Found\r\n");
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private Integer extractIdFromRequest(String requestLine) {
        String[] parts = requestLine.split(" ");
        String[] pathParts = parts[1].split("/");
        return Integer.parseInt(pathParts[2]);
    }

    private Item extractItemFromRequest(BufferedReader in) throws IOException {
        String body = in.readLine();
        String[] itemData = body.split(",");
        return new Item(itemData[0], itemData[1], Double.parseDouble(itemData[2]), itemData[3]);
    }

    private void sendJsonResponse(PrintWriter out, Object response) throws IOException {
        String jsonResponse = objectMapper.writeValueAsString(response);
        out.println("HTTP/1.1 200 OK\r\n" +
                "Content-Type: application/json\r\n" +
                "Access-Control-Allow-Origin: *\r\n" + // Allow all origins
                "\r\n" + jsonResponse);
    }

    private void sendErrorResponse(PrintWriter out, String message) throws IOException {
        String jsonResponse = objectMapper.writeValueAsString(message);
        out.println("HTTP/1.1 200 OK\r\n" +
                "Content-Type: application/json\r\n" +
                "Access-Control-Allow-Origin: *\r\n" + // Allow all origins
                "\r\n" + jsonResponse);
    }
}

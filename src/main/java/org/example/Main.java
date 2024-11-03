package org.example;

import org.example.app.service.ItemService;
import org.example.app.utils.RequestHandler;

public class Main {

    public static void main(String[] args) {

        ItemService itemService = new ItemService();
        RequestHandler requestHandler = new RequestHandler(itemService);

        requestHandler.runApp();
    }
}

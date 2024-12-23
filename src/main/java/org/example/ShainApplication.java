package org.example;

import org.example.app.service.CustomerService;
import org.example.app.service.ItemService;
import org.example.app.utils.RequestHandler;

public class ShainApplication {

    public static void main(String[] args) {

        ItemService itemService = new ItemService();
        RequestHandler requestHandler = new RequestHandler(itemService);
        requestHandler.runApp();
    }
}

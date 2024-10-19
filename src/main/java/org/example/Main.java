package org.example;

import org.example.app.service.ShainService;
import org.example.app.utils.RequestHandler;

public class Main {

    public static void main(String[] args) {

        ShainService shainService = new ShainService();
        RequestHandler requestHandler = new RequestHandler(shainService);

        requestHandler.runApp();
    }
}

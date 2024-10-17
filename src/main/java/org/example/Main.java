package org.example;

import org.example.app.model.Cart;
import org.example.app.model.Customer;
import org.example.app.model.Item;
import org.example.app.service.ShainService;

public class Main {

    public static void main(String[] args) {

        ShainService shainService = new ShainService();
        shainService.runApp();
    }
}

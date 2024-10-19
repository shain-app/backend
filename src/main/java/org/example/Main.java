package org.example;

import org.example.app.repository.ShainDatabase;
import org.example.app.service.ShainService;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        ShainDatabase shainDatabase = new ShainDatabase();
        System.out.println(shainDatabase.getInMemoryDatabase().size());

    }
}

package org.example;

import org.example.app.repository.ShainDatabase;

public class Main {

    public static void main(String[] args) {

        ShainDatabase shainDatabase = new ShainDatabase();
        System.out.println(shainDatabase.getInMemoryDatabase().size());
    }
}

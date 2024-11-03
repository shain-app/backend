package org.example.app.service;

import org.example.app.model.Item;
import org.example.app.repository.ShainDatabase;

public class ItemService {

    private final ShainDatabase shainDatabase = new ShainDatabase();

    public Item getItem(Integer id) {
        return shainDatabase.getInMemoryDatabase().get(id);
    }
}

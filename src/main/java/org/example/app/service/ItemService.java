package org.example.app.service;

import org.example.app.model.Item;
import org.example.app.repository.ShainDatabase;

import java.util.List;

public class ItemService {

    private final ShainDatabase shainDatabase = new ShainDatabase();

    public Item getItem(Integer id) {
        return shainDatabase.getInMemoryDatabase().get(id);
    }

    public List<Item> getAll() {
        return shainDatabase.getInMemoryDatabase();
    }
}

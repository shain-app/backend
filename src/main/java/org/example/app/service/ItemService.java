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

    // Method to create a new item
    public void create(Item item) {
        shainDatabase.getInMemoryDatabase().add(item);
    }

    // Method to remove an item by id
    public boolean remove(Integer id) {
        List<Item> items = shainDatabase.getInMemoryDatabase();
        return items.removeIf(item -> item.getId().equals(id));
    }
}


package org.example.app.service;

import org.example.app.model.Item;
import org.example.app.repository.ItemRepository;

import java.util.List;

public class ItemService {

    private final ItemRepository itemRepository = new ItemRepository();

    public Item getItem(Integer id) {
        return itemRepository.getInMemoryDatabase().get(id);
    }

    public List<Item> getAll() {
        return itemRepository.getInMemoryDatabase();
    }

    // Method to create a new item
    public Item create(Item item) {
        List<Item> database = itemRepository.getInMemoryDatabase();
        database.add(item);
        return item;
    }

    // Method to remove an item by id
    public void remove(String id) {
        itemRepository.getInMemoryDatabase().removeIf(item -> item.getId().equals(id));
    }
}


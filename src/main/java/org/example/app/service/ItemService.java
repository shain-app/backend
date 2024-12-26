package org.example.app.service;

import org.example.app.model.Item;
import org.example.app.repository.ItemRepository;

import java.util.List;

/**
 * This class represents the business logic related to data handling for items in the ShainApp.
 */
public class ItemService {

    private final ItemRepository itemRepository = new ItemRepository();

    public Item getItem(Integer id) {
        return itemRepository.getItems().get(id);
    }

    public List<Item> getAll() {
        return itemRepository.getItems();
    }

    // Method to create a new item
    public Item create(Item item) {
        itemRepository.getItems().add(item);
        return item;
    }

    // Method to remove an item by id
    public void remove(String id) {
        itemRepository.getItems().removeIf(item -> item.getId().equals(id));
    }
}


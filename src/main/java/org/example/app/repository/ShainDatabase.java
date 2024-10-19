package org.example.app.repository;

import org.example.app.model.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * This class will represent an in-memory database. It will have a simple list and pre-initialised items
 * when the app starts.
 */
public class ShainDatabase {

    private List<Item> inMemoryDatabase = new ArrayList<>();

    public ShainDatabase() {
        initializeDatabase();
    }

    // Method to initialize the database with 25 pre-defined items
    public void initializeDatabase() {
        inMemoryDatabase.add(new Item("T-shirt", "M", 19.99, "Clothing"));
        inMemoryDatabase.add(new Item("Jeans", "L", 49.99, "Clothing"));
        inMemoryDatabase.add(new Item("Sneakers", "42", 89.99, "Footwear"));
        inMemoryDatabase.add(new Item("Jacket", "XL", 99.99, "Clothing"));
        inMemoryDatabase.add(new Item("Hat", "One Size", 14.99, "Accessories"));
        inMemoryDatabase.add(new Item("Socks", "M", 4.99, "Footwear"));
        inMemoryDatabase.add(new Item("Scarf", "One Size", 12.99, "Accessories"));
        inMemoryDatabase.add(new Item("Belt", "L", 24.99, "Accessories"));
        inMemoryDatabase.add(new Item("Watch", "One Size", 149.99, "Accessories"));
        inMemoryDatabase.add(new Item("Sunglasses", "One Size", 59.99, "Accessories"));
        inMemoryDatabase.add(new Item("Shorts", "M", 29.99, "Clothing"));
        inMemoryDatabase.add(new Item("Dress", "S", 69.99, "Clothing"));
        inMemoryDatabase.add(new Item("Sandals", "39", 29.99, "Footwear"));
        inMemoryDatabase.add(new Item("Boots", "44", 109.99, "Footwear"));
        inMemoryDatabase.add(new Item("Backpack", "One Size", 79.99, "Accessories"));
        inMemoryDatabase.add(new Item("Sweater", "L", 59.99, "Clothing"));
        inMemoryDatabase.add(new Item("Blazer", "M", 119.99, "Clothing"));
        inMemoryDatabase.add(new Item("Gloves", "M", 19.99, "Accessories"));
        inMemoryDatabase.add(new Item("Tie", "One Size", 19.99, "Accessories"));
        inMemoryDatabase.add(new Item("Shoes", "43", 129.99, "Footwear"));
        inMemoryDatabase.add(new Item("Wallet", "One Size", 39.99, "Accessories"));
        inMemoryDatabase.add(new Item("Cap", "One Size", 9.99, "Accessories"));
        inMemoryDatabase.add(new Item("Coat", "M", 149.99, "Clothing"));
        inMemoryDatabase.add(new Item("Trousers", "S", 59.99, "Clothing"));
        inMemoryDatabase.add(new Item("Flip-Flops", "40", 19.99, "Footwear"));
    }

    public List<Item> getInMemoryDatabase() {
        return inMemoryDatabase;
    }
}


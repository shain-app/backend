package org.example.app.model;

public class Item {

    private String id;
    private String name;
    private String size;
    private double price;
    private String category;

    public Item(String name, String size, double price, String category) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative.");
        }
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty.");
        }
        this.name = name;
        this.size = size;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty.");
        }
        this.name = name;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setPrice(double price) {
        if (price < 0) { // Validation in setter
            throw new IllegalArgumentException("Price cannot be negative.");
        }
        this.price = price;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
package org.example.app.service;

import org.example.app.model.Cart;
import org.example.app.model.Item;

import java.util.List;

public class CartService {
    private Cart cart;

    public CartService() {
        this.cart = new Cart();
    }

    // Method to add an item to the cart with error handling
    public String addItemToCart(Item item) {
        try {
            cart.getItemList().add(item);
            return "Item added successfully.";
        } catch (IllegalArgumentException e) {
            return "Validation error: " + e.getMessage();
        } catch (Exception e) {
            return "There is an error coming from the database.";
        }
    }

    // Method to calculate the total price
    public double calculateTotalPrice() {
        return cart.calculateTotalPrice();
    }

    // Method to remove an item by name
    public String removeItemByName(String itemName) {
        List<Item> items = cart.getItemList();
        for (Item item : items) {
            if (item.getName().equalsIgnoreCase(itemName)) {
                items.remove(item);
                return "Item removed successfully.";
            }
        }
        return "Item not found.";
    }

    // Method to clear all items from the cart
    public String clearCart() {
        cart.getItemList().clear();
        return "Cart cleared.";
    }
}

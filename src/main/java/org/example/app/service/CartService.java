package org.example.app.service;

import org.example.app.model.Cart;
import org.example.app.model.Customer;
import org.example.app.model.Item;

import java.util.List;

public class CartService {

    // Method to add an item to the cart with error handling
    public String addItemToCart(Item item, Customer customer) {
        try {
            customer.getCart().getItemList().add(item);
            return "Item added successfully.";
        } catch (IllegalArgumentException e) {
            return "Validation error: " + e.getMessage();
        } catch (Exception e) {
            return "There is an error coming from the database.";
        }
    }

    // Method to calculate the total price
    public double calculateTotalPrice(Customer customer) {
        return customer.getCart().calculateTotalPrice();
    }

    // Method to remove an item by name
    public String removeItemByName(String itemName, Customer customer) {
        List<Item> items = customer.getCart().getItemList();
        for (Item item : items) {
            if (item.getName().equalsIgnoreCase(itemName)) {
                items.remove(item);
                return "Item removed successfully.";
            }
        }
        return "Item not found.";
    }

    // Method to clear all items from the cart
    public String clearCart(Customer customer) {
        customer.getCart().getItemList().clear();
        return "Cart cleared.";
    }
}

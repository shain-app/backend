package org.example.app.service;

import org.example.app.model.Customer;
import org.example.app.model.Item;

import java.util.List;

/**
 * This class represents the business logic related to adding, removing and other operations related
 * to a Customer's cart.
 */
public class CartService {

    // Method to add an item to the cart
    public String addItemToCart(Item item, Customer customer) {
        customer.getCart().getItemList().add(item);
        return "";
    }

    // Method to calculate the total price
    public double calculateTotalPrice(Customer customer) {
        double totalPrice = 0.0;

        for (Item item : customer.getCart().getItemList()) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }

    // Method to find the Item by his 'id' field
    public String removeItemById(String itemId, Customer customer) {
        List<Item> items = customer.getCart().getItemList();
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getId().equalsIgnoreCase(itemId)) {
                items.remove(i);
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

package org.example.app.service;

import org.example.app.model.Cart;
import org.example.app.model.Customer;
import org.example.app.model.Item;

public class ShainService {

    public void runApp() {

        Customer customer = new Customer("Gosho", 36);

        Item itemOne = new Item("Dress", "SMALL", 34.99, "Clothes");
        Item itemTwo = new Item("Leggings", "MEDIUM", 14.99, "Clothes");
        Item itemThree = new Item("Skirt", "LARGE", 20.98, "Clothes");

        Cart cart = new Cart();

        cart.getItemList().add(itemOne);
        cart.getItemList().add(itemOne);
        cart.getItemList().add(itemTwo);
        cart.getItemList().add(itemThree);

        for (int i=0 ; i<cart.getItemList().size() ; i++) {
            System.out.println(cart.getItemList().get(i).getName());
        }

        System.out.println(cart.calculateTotalPrice());

    }
}

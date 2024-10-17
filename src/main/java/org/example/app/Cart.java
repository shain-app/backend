package org.example.app;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private List<Item> itemList = new ArrayList<>();

    public double calculateTotalPrice() {
        double totalPrice = 0.0;

        for (Item item : itemList) {
           totalPrice += item.getPrice();
        }
        return totalPrice;
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }
}

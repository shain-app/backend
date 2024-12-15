package org.example.app.model;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents data on how a cart object should be created and te properties it will have.
 */
public class Cart {

    /**
     * These are the properties of the Cart class
     */
    private String id;
    private List<Item> itemList = new ArrayList<>();

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

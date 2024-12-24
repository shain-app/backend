package org.example.app.api;

import org.example.app.model.Item;
import org.example.app.service.ItemService;

import java.util.List;

/**
 * This class will represent the doorway to the backend app. This is where the application will receive
 * data from the frontend and sent back the necessary response.
 */
public class ApiGateway {

    private final ItemService itemService;

    public ApiGateway(ItemService itemService) {
        this.itemService = itemService;
    }

    // GET - http://localhost:8080/items/{id}
    public Item getItem(Integer id) {
        return itemService.getItem(id);
    }

    // GET - http://localhost:8080/all
    public List<Item> getAll() {
        return itemService.getAll();
    }
}

package org.example.app.api;

import org.example.app.model.Item;
import org.example.app.service.ShainService;

import java.util.List;

/**
 * This class will represent the doorway to the backend app. This is where the application will receive
 * data from the frontend and sent back the necessary response.
 */
public class ShainApi {

    private final ShainService shainService;

    public ShainApi(ShainService shainService) {
        this.shainService = shainService;
    }

    // GET - http://localhost:8080/items/{id}
    public Item getItem(Integer id) {
        return shainService.getItem(id);
    }

    // GET - http://localhost:8080/all
    public List<Item> getAll() {
        return shainService.getAll();
    }
}

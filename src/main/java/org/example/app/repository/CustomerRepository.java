package org.example.app.repository;

import org.example.app.model.Customer;

import java.util.ArrayList;
import java.util.List;

/**
 * This class will represent in-memory database for storing customer data.
 */
public class CustomerRepository {

    private final List<Customer> customers = new ArrayList<>();

    public List<Customer> getCustomers() {
        return customers;
    }

}

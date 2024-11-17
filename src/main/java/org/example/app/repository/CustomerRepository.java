package org.example.app.repository;

import org.example.app.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository {

    private final List<Customer> customers = new ArrayList<>();

    public List<Customer> getCustomers() {
        return customers;
    }

}

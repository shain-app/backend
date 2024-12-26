package org.example.app.service;

import org.example.app.model.Customer;
import org.example.app.repository.CustomerRepository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CustomerService {

    CustomerRepository customerRepository;

    //Method to create a customer
    public void createCustomer(String name, int age, String email, String address, String city, String country,
                               String phoneNumber, LocalDate dateOfBirth, int loyaltyPoints, LocalDate accountCreationDate,
                               String preferredPaymentMethod) {

        Customer customer = new Customer(name, age, email, address, city, country, phoneNumber, dateOfBirth,
                loyaltyPoints, accountCreationDate, preferredPaymentMethod);

        customerRepository.getCustomers().add(customer);
    }

    // Method to remove a customer
    public void removeCustomer(String customerId) {

    }
}

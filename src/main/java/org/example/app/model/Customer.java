package org.example.app.model;

import java.time.LocalDate;

public class Customer {

    private String name;
    private int age;
    private String email;
    private String address;
    private String city;
    private String country;
    private String phoneNumber;
    private LocalDate dateOfBirth;
    private int loyaltyPoints;
    private LocalDate accountCreationDate;
    private String preferredPaymentMethod;
    
    public Customer(String name, int age, String email, String address, String city, String country, String phoneNumber,
            LocalDate dateOfBirth, int loyaltyPoints, LocalDate accountCreationDate, String preferredPaymentMethod) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.address = address;
        this.city = city;
        this.country = country;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
        this.loyaltyPoints = loyaltyPoints;
        this.accountCreationDate = accountCreationDate;
        this.preferredPaymentMethod = preferredPaymentMethod;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        if (newName == null || newName.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty.");
        }
        this.name = newName;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int newAge) {
        if (newAge < 0 ) {
            throw new IllegalArgumentException("Age can't be 0 or below 0.");
        }
        this.age = newAge;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null || email.isEmpty()) {
            throw new IllegalArgumentException("Email cannot be null or empty.");
        }
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        if (dateOfBirth == null || dateOfBirth.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("Date of birth is invalid.");
        }
        this.dateOfBirth = dateOfBirth;
    }

    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }

    public void setLoyaltyPoints(int loyaltyPoints) {
        if (loyaltyPoints < 0) {
            throw new IllegalArgumentException("Loyalty points cannot be negative.");
        }
        this.loyaltyPoints = loyaltyPoints;
    }

    public LocalDate getAccountCreationDate() {
        return accountCreationDate;
    }

    public void setAccountCreationDate(LocalDate accountCreationDate) {
        if (accountCreationDate == null || accountCreationDate.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("Account creation date is invalid.");
        }
        this.accountCreationDate = accountCreationDate;
    }

    public String getPreferredPaymentMethod() {
        return preferredPaymentMethod;
    }

    public void setPreferredPaymentMethod(String preferredPaymentMethod) {
        this.preferredPaymentMethod = preferredPaymentMethod;
    }
}

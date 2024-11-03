package org.example.app.model;

public class Customer {

    private String name;
    private int age;

    public Customer(String name, int age){
        if (age <= 0) {
            throw new IllegalArgumentException("Age must be greater than 0.");
        }
        this.name = name;
        this.age = age;
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
}

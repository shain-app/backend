package org.example.app.model;

public class Customer {

    private String name;
    private int age;

    public Customer(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int newAge) {
        if(newAge > 0) {
            this.age = newAge;
        }
        System.out.println("Age can't be 0 or below 0.");
    }
}

package com.example.testgithubcodespaces.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Car {

    @Id
    @GeneratedValue
    private Long id;
    private String brand;
    private String model;

    public Car() {}

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public Car(long id, String brand, String model) {
        this.id = id;
        this.brand = brand;
        this.model = model;
    }

    // Gettery i settery
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }
    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }
}
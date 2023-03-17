package org.example.model;

import java.util.Objects;

public class Car {
    private int id;
    private String brand;

    public int getId() {
        return id;
    }
    private String model;
    private String color;
    private int yearOfIssue;
    private boolean isUsed;
    private double price;

    public Car(int id, String brand, String model, String color, int yearOfIssue, boolean isUsed, double price) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.yearOfIssue = yearOfIssue;
        this.isUsed = isUsed;
        this.price = price;
    }

    public Car() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public boolean isUsed() {
        return isUsed;
    }

    public void setUsed(boolean used) {
        isUsed = used;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, brand, model, color, yearOfIssue, isUsed, price);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return id == car.id;
    }

    @Override
    public String toString() {
        return "Car {" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", yearOfIssue=" + yearOfIssue +
                ", isUsed=" + isUsed +
                ", price=" + price +
                '}';
    }
}



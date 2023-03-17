package org.example.service;

import org.example.model.Car;

import java.util.List;

public interface ServiceCar {
    void createDataBase();

    void addCar(String brand, String model, String color, int yearOfIssue, boolean isUsed, double price);

    void deleteCar(int id);

    void clearDateBase();

    void deleteDataBase();

    List<Car> getAllCar() ;

    Car getCarById(int id);
}

package org.example.dao;

import org.example.model.Car;

import java.util.List;

public interface DAOinterface {
    void createDataBase();

    void addCar(String brand, String model, String color, int yearOfIssue, boolean isUsed, double price);

    void deleteCar(int i);

    void clearDateBase();

    void deleteDataBase();

    List<Car> getAllCar();

    void getCarById(int id);


}

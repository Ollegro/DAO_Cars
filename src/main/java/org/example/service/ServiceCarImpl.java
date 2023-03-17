package org.example.service;

import org.example.dao.CarDaoImpl;
import org.example.model.Car;

import java.util.List;

public class ServiceCarImpl implements ServiceCar {
    private final CarDaoImpl carDaoImpl = new CarDaoImpl();

    @Override
    public void createDataBase() {
        carDaoImpl.createDataBase();
    }

    @Override
    public void addCar(String brand, String model, String color, int yearOfIssue, boolean isUsed, double price) {
        carDaoImpl.addCar(brand, model, color, yearOfIssue, isUsed, price);
    }

    @Override
    public void deleteCar(int id) {
        carDaoImpl.deleteCar(id);
    }

    @Override
    public void clearDateBase() {
        carDaoImpl.clearDateBase();
    }

    @Override
    public void deleteDataBase() {
        carDaoImpl.deleteDataBase();
    }

    @Override
    public List<Car> getAllCar() {
        return carDaoImpl.getAllCar();
    }

    @Override
    public Car getCarById(int id) {
        return carDaoImpl.getCarById(id);
    }
}

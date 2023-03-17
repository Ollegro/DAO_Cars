package org.example.dao;

import org.example.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarDaoImpl implements CarDao {
    private int id;
    private List<Car> carList;


    @Override

    public void createDataBase() {
        carList = new ArrayList<>();
        System.out.println("БД создана!");
    }

    @Override
    public void addCar(String brand, String model, String color, int yearOfIssue, boolean isUsed, double price) {
        carList.add(new Car(++id, brand, model, color, yearOfIssue, isUsed, price));
        System.out.println("Car id " + id + " brand " + brand + " модель " + model + " цена " + price + " добавлен в БД");
    }

    @Override
    public void deleteCar(int id) {
        for (int i = 0; i < carList.size(); i++) {
            if (carList.get(i).getId() == id) {
                carList.remove(i);
                i--;

            }
        }
        System.out.println("Delete car id:" + id);
    }

    @Override
    public void clearDateBase() {
        carList.clear();
    }

    @Override
    public void deleteDataBase() {
        carList = null;
        System.out.println("БД удалена!");
    }

    @Override
    public List<Car> getAllCar() {
        if (carList == null) {
            System.out.println("БД отсутствует!");
            return null;
        } else if (carList.isEmpty()) {
            System.out.println("БД есть, но пуста !");
            return carList;
        } else {
            System.out.println();
            return carList;
        }
    }

    @Override
    public Car getCarById(int id) {
        for (int i = 0; i < carList.size(); i++) {
            if (carList.get(i).getId() == id)
                return carList.get(i);
        }
        System.out.println("Индекса " + id + " нет !  ");
        return null;
    }
}

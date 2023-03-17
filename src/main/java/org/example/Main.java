package org.example;

import org.example.service.ServiceCarImpl;

public class Main {
    public static void main(String[] args) {

        ServiceCarImpl serviceCarImpl = new ServiceCarImpl();
        serviceCarImpl.createDataBase();
        serviceCarImpl.addCar("Volvo", "C60", "black", 2015, true, 1500000.0);
        serviceCarImpl.addCar("Ford", "Focus", "blue", 2018, true, 1600000.0);
        serviceCarImpl.addCar("Subaru", "Vitara", "white", 2017, true, 1300000.0);
        serviceCarImpl.addCar("ВАЗ", "Веста", "grey", 2023, false, 1000000.0);
        serviceCarImpl.addCar("Cherry", "Tigo", "red", 2022, false, 2500000.0);
        serviceCarImpl.addCar("BMW", "X3", "black", 2017, true, 2000000.0);
        serviceCarImpl.getAllCar().forEach(System.out::println);
        System.out.println();

        serviceCarImpl.deleteCar(6);
        serviceCarImpl.getCarById(55);
        serviceCarImpl.deleteCar(2);
        serviceCarImpl.getAllCar().forEach(System.out::println);
        System.out.println();
        serviceCarImpl.clearDateBase();
        System.out.println();
        serviceCarImpl.getAllCar().forEach(System.out::println);
        serviceCarImpl.deleteDataBase();
        try {
            serviceCarImpl.getAllCar().forEach(System.out::println);
        } catch (NullPointerException e) {
            System.out.println(e.getLocalizedMessage());
        }

    }
}
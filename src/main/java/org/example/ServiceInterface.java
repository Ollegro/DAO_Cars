package org.example;

public interface ServiceInterface {

    void createDataBase();
    void addCar( String brand, String model,  String color, int yearOfIssue, boolean isUsed, double price );
    void  deleteCar(int id);
    void  clearDateBase();
    void deleteDataBase();
    void getAllCar ();
    void getCarById(int id);
}

package org.example;

public class ServiceClass implements ServiceInterface{
private final DAOclass daOclass = new DAOclass();
    @Override
    public void createDataBase() {
        daOclass.createDataBase();
    }

    @Override
    public void addCar(String brand, String model, String color, int yearOfIssue, boolean isUsed, double price) {
        daOclass.addCar(brand, model, color, yearOfIssue, isUsed, price);
    }

    @Override
    public void deleteCar(int id) {
daOclass.deleteCar(id);
        System.out.println("Delete car id:" + id);
    }

    @Override
    public void clearDateBase() {
daOclass.clearDateBase();
    }

    @Override
    public void deleteDataBase() {
daOclass.deleteDataBase();
    }

    @Override
    public void getAllCar() {
        try{      daOclass.getAllCar().forEach(System.out::println);}
        catch (NullPointerException e){
            System.out.println(e.getCause());
        }
    }

    @Override
    public void getCarById(int id) {
        System.out.print("getCarById:  ");
        daOclass.getCarById(id);

    }
}

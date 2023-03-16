package org.example;

public class Main {
    public static void main(String[] args) {

        ServiceClass serviceClass = new ServiceClass();
        serviceClass.createDataBase();
        serviceClass.addCar("Volvo","C60", "black", 2015, true,1500000.0);
        serviceClass.addCar("Ford","Focus", "blue", 2018, true,1600000.0);
        serviceClass.addCar("Subaru","Vitara", "white", 2017, true,1300000.0);
        serviceClass.addCar("ВАЗ","Гранта", "grey", 2023, false,1000000.0);
        serviceClass.addCar("Cherry","Tigo", "red", 2022, false,2500000.0);
        serviceClass.addCar("BMW","X3", "black", 2017, true,2000000.0);
        serviceClass.getAllCar();
        serviceClass.getCarById(1);

        serviceClass.deleteCar(1);
        serviceClass.getAllCar();
       serviceClass.clearDateBase();
       serviceClass.getAllCar();
        serviceClass.addCar("ВАЗ","Гранта", "grey", 2023, false,1000000.0);
        serviceClass.addCar("Cherry","Tigo", "red", 2022, false,2500000.0);
        serviceClass.getAllCar();
       serviceClass.deleteDataBase();
        serviceClass.getAllCar();
    }
}
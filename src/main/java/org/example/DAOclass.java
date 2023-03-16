package org.example;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DAOclass implements DAOinterface{
    int id;
    List<Car> carlist;

    @Override
    public void createDataBase() {
        carlist = new ArrayList<>();
        System.out.println("БД создана!");
    }

    @Override
    public void addCar(String brand,String model, String color, int yearOfIssue, boolean isUsed, double price) {
        carlist.add(new Car(++id,brand,model,color,yearOfIssue,isUsed,price  ));
        System.out.println("Car id " + id + " brand "+brand + " модель " +model+ " цена " + price+" добавлен в БД");
    }
    @Override
    public void deleteCar(int id) {
        --id;
    carlist.remove(id);
    }

    @Override
    public void clearDateBase() {

        carlist.clear();
    }

    @Override
    public void deleteDataBase() {
carlist = null;
        System.out.println("БД удалена!");
    }
    @Override
    public List<Car> getAllCar() {
        if (carlist == null) {
            System.out.println("БД отсутствует!");
            return  null;
        }
else  if (carlist.isEmpty()) {
System.out.println("БД есть но пуста !");
return carlist;}
else {return carlist;}

    }


    @Override
    public void getCarById(int id) {
        --id;
        System.out.println(carlist.get(id));
    }
}

package oop.example.tool;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Car car2 = new Car();
        car.setBrand("Mercedes");
        car2.setBrand("BMW");
        Car[] cars = {car, car2};

        Car[] results = filterCars(cars, 'M');
        for (int i = 0; i < results.length; i++) {
            System.out.println(cars[i].getBrand());
        }

        ArrayList<Car> list = new ArrayList<>();
    }

    public static Car[] filterCars(Car[] cars, char letter) {
        List<Car> filterCarsList = new ArrayList<>();

        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getBrand().charAt(0) == letter) {
                filterCarsList.add(cars[i]);
            }
        }
        Car[] result = new Car[filterCarsList.size()];

        return filterCarsList.toArray(result);
    }

    public static ArrayList<Car> sortCars(ArrayList<Car> cars, boolean sortDesc) {
        if(sortDesc){
            cars.sort((c1,c2) -> c2.getBrand().compareTo(c1.getBrand()));
        } else{
            cars.sort((c1,c2) -> c1.getBrand().compareTo(c2.getBrand()));
        }
        //cars.sort((c1,c2) -> sortDesc?  c2.getBrand().compareTo(c1.getBrand()) : c1.getBrand().compareTo(c2.getBrand()));
        return cars;
    }
}

package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarService {

   private List<Car> cars;


    public CarService(){
        cars = new ArrayList<>();
        cars.add(new Car("Porshe","Boxter",2005));
        cars.add(new Car("bmw","x5m",2021));
        cars.add(new Car("toyota","crown",1998));
        cars.add(new Car("Bentley","ContinentalGT",2005));
        cars.add(new Car("toyota","supra",2021));
    }

    public  List<Car> getAnyCars(int count){
            return (count < cars.size() )? cars.subList(0,count) : cars;
        }

}


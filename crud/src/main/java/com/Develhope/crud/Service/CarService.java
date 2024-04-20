package com.Develhope.crud.Service;

import com.Develhope.crud.entities.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
    private List<Car> carList=new ArrayList<>();


    public Car aggiungiCar(Car car){
        carList.add(car);
        return car;
    }

    public Car eliminaCar(Long id){
        Car car1=new Car();
        for (Car car:carList) {
            if(car.getId().equals(id)){
                carList.remove(car);
                car1=car;
            }
        }
        return car1;
    }
}

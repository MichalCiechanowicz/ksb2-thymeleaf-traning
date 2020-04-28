package com.poweremabox.ksb2thymeleaf.servcie;

import com.poweremabox.ksb2thymeleaf.model.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    private List<Car> carList;

    public CarService() {
        this.carList = new ArrayList<>();

        carList.add(new Car("Bmw", "i8"));
        carList.add(new Car("Audi", "A8"));
        carList.add(new Car("Toyota", "Celica"));
        carList.add(new Car("Mazda", "CX-5"));

    }
    public void addCar(Car car){
        carList.add(car);
    }

    public List<Car> getCarList() {
        return carList;
    }
}

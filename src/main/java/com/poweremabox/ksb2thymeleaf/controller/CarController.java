package com.poweremabox.ksb2thymeleaf.controller;

import com.poweremabox.ksb2thymeleaf.model.Car;
import com.poweremabox.ksb2thymeleaf.servcie.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class CarController {

    private CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/car")
    public String getCar(Model model){

        List<Car> carList = carService.getCarList();
        Car car = carList.get(1);

        model.addAttribute("name", "Michal");
        model.addAttribute("car1", car);
        model.addAttribute("newCar",new Car());

        model.addAttribute("cars", carList);
        return "car";
    }
    @PostMapping("/add-car")
    public String addCar(@ModelAttribute Car car){
        carService.addCar(car);
        return "redirect:/car";
    }

}

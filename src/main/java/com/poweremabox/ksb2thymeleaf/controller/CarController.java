package com.poweremabox.ksb2thymeleaf.controller;

import com.poweremabox.ksb2thymeleaf.model.Car;
import com.poweremabox.ksb2thymeleaf.servcie.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/car")
public class CarController {

    private CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    public String hello(Model model){

        List<Car> carList = carService.getCarList();
        Car car = carList.get(1);

        model.addAttribute("name", "Michal");
        model.addAttribute("car1", car);

        model.addAttribute("cars", carList);
        return "car";
    }

}

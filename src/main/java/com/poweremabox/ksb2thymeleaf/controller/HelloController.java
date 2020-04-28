package com.poweremabox.ksb2thymeleaf.controller;

import com.poweremabox.ksb2thymeleaf.model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/car")
public class HelloController {

    @GetMapping
    public String hello(Model model){

        Car car = new Car("Syrenka", "103");

        model.addAttribute("name", "Michal");
        model.addAttribute("car", car);
        return "car";
    }

}

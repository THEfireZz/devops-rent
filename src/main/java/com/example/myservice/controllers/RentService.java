package com.example.myservice.controllers;

import com.example.myservice.entities.Car;
import com.example.myservice.services.CarService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class RentService {

    private final CarService carService;

    public RentService(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/")
    public String sayHello(){
        return "Hello";
    }

    @PostMapping("/cars")
    public void addCar(@RequestBody Car car){
        carService.addCar(car);
    }

    @GetMapping("/cars")
    public List<Car> getCars(){
        return carService.getCars();
    }

    @GetMapping("/cars/{plateNumber}")
    public Car getCar(@PathVariable String plateNumber){
        return carService.getCar(plateNumber);
    }

}
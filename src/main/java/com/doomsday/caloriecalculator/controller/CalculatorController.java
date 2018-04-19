package com.doomsday.caloriecalculator.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {


    @RequestMapping(value = "/getCalorieMan/{formula}/{weigth}/{heigth}")
    public double getCalorieMan(String formula, Double weigth,Double heigth){
        return 0;
    }

    @RequestMapping(value = "/getCalorieWomen/{formula}/{weigth}/{heigth}")
    public double getCalorieWomen(String formula, Double weigth,Double heigth){
        return 0;
    }
}

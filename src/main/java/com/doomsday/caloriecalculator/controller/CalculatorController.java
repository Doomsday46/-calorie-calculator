package com.doomsday.caloriecalculator.controller;

import com.doomsday.caloriecalculator.service.FormulaCalorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @Autowired
    private FormulaCalorieService service;

    @RequestMapping(value = "/getCalorieMan/{formula}/{weight}/{height}/{age}")
    public double getCalorieMan(@PathVariable String formula, @PathVariable Double weight, @PathVariable Double height, @PathVariable Integer age) {
        return service.calculateCalorie(formula, weight, height, age, "man");
    }

    @RequestMapping(value = "/getCalorieWomen/{formula}/{weight}/{height}/{age}")
    public double getCalorieWomen(@PathVariable String formula, @PathVariable Double weight, @PathVariable Double height, @PathVariable Integer age) {
        return service.calculateCalorie(formula, weight, height, age, "women");
    }
}

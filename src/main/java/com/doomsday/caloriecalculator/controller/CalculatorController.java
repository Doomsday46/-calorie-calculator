package com.doomsday.caloriecalculator.controller;

import com.doomsday.caloriecalculator.service.CalorieFormulaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @Autowired
    private CalorieFormulaService service;

    @RequestMapping(value = "/getCalorieMan/{formula}/{weight}/{height}/{activity}/{age}")
    public double getCalorieMan(@PathVariable String formula, @PathVariable Double weight, @PathVariable Double height, @PathVariable Double activity, @PathVariable Integer age) {
        return service.calculateCalorie(formula, weight, height, age,activity, "man");
    }

    @RequestMapping(value = "/getCalorieWomen/{formula}/{weight}/{height}/{activity}/{age}")
    public double getCalorieWomen(@PathVariable String formula, @PathVariable Double weight, @PathVariable Double height, @PathVariable Double activity, @PathVariable Integer age) {
        return service.calculateCalorie(formula, weight, height, age,activity, "women");
    }
}

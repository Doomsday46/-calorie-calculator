package com.doomsday.caloriecalculator.controller;

import com.doomsday.caloriecalculator.Service.DataBaseService;
import com.doomsday.caloriecalculator.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {

    @Autowired
    private DataBaseService service;

    @RequestMapping(value = "/user/{name}/{surname}/{param_id}")
    public void getCalorieMan(@PathVariable String name, @PathVariable String surname, @PathVariable Long param_id) {
         service.addUser(name, surname, param_id);
    }

    @RequestMapping(value = "/getUser/{id}")
    public User getCalorieWomen(@PathVariable Long id) {
        return service.getUser(id);
    }
}

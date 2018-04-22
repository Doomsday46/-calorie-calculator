package com.doomsday.caloriecalculator.controller;

import com.doomsday.caloriecalculator.Service.DataBaseService;
import com.doomsday.caloriecalculator.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {

    @Autowired
    private DataBaseService service;

    @RequestMapping(value = "/user/{name}/{surname}/{weight}/{height}/{age}/{activity}", method = RequestMethod.POST)
    public void addUser(@PathVariable String name,@PathVariable String surname,@PathVariable Double weight,@PathVariable Double height,@PathVariable Integer age,@PathVariable Double activity) {
         service.addUser(name, surname, weight,height,age,activity);
    }

    @RequestMapping(value = "/updateUser/{id}/{name}/{surname}/{weight}/{height}/{age}/{activity}")
    public void updateUser(@PathVariable Long id,@PathVariable String name,@PathVariable String surname,@PathVariable Double weight,@PathVariable Double height,@PathVariable Integer age,@PathVariable Double activity) {
        service.updateUser(id,name, surname, weight,height,age,activity);
    }

    @RequestMapping(value = "/deleteUser/{id}")
    public void deleteUser(@PathVariable Long id) {
        service.deleteUser(id);
    }

    @RequestMapping(value = "/getUser/{id}", method = RequestMethod.GET)
    public User getUser(@PathVariable Long id) {
        return service.getUser(id);
    }
}

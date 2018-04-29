package com.doomsday.caloriecalculator.service;

import com.doomsday.caloriecalculator.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import java.util.List;

//@Service
//
//@ComponentScan("com.doomsday.caloriecalculator")
//public class UserService {
//
//    @Autowired
//    private UserRepository userRepository;
//
//    public UserService(){
//    }
//
//    public void addUser(String name, String surname, Double weight, Double height, Integer age, Double activity){
//        userRepository.save(new User(name, surname, weight,height,age,activity));
//    }
//
//    public void updateUser(Long id,String name, String surname, Double weight, Double height, Integer age, Double activity){
//        userRepository.save(new User(id, name, surname, weight,height,age,activity));
//    }
//
//    public void deleteUser(Long id){
//        userRepository.deleteById(id);
//    }
//
//    public User getUser(Long id){
//      return userRepository.getOne(id);
//    }
//
//    public List getUsers(){
//        return userRepository.findAll();
//    }
//}

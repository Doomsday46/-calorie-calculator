package com.doomsday.caloriecalculator.service;

import com.doomsday.caloriecalculator.dao.HibernateUserDao;
import com.doomsday.caloriecalculator.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import java.util.List;
@Configuration
public class UserHibernateService {

    @Autowired
    private HibernateUserDao hibernateUserDao;

    public UserHibernateService(){
    }

    public void addUser(String name, String surname, Double weight, Double height, Integer age, Double activity){
        hibernateUserDao.addUser(new User(name, surname, weight,height,age,activity));
    }

    public void updateUser(Long id,String name, String surname, Double weight, Double height, Integer age, Double activity){
        hibernateUserDao.updateUser(id,new User(name, surname, weight,height,age,activity));
    }

    public void deleteUser(Long id){
        hibernateUserDao.removeUser(id);
    }

    public User getUser(Long id){
        return hibernateUserDao.getUserById(id);
    }

    public List getUsers(){
        return hibernateUserDao.listUsers();
    }
}

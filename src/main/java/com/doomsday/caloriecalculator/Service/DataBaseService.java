package com.doomsday.caloriecalculator.Service;

import com.doomsday.caloriecalculator.config.JdbcConfig;
import com.doomsday.caloriecalculator.dao.JdbcTemplateUserDao;
import com.doomsday.caloriecalculator.dao.UserDao;
import com.doomsday.caloriecalculator.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;

@Service
@ComponentScan("com.doomsday.caloriecalculator")
public class DataBaseService {

    @Autowired
    private JdbcTemplateUserDao userDao;

    public DataBaseService(){
    }

    public void addUser(String name, String surname, Double weight, Double height, Integer age, Double activity){
        userDao.addUser(name, surname, weight,height,age,activity);
    }

    public void updateUser(Long id,String name, String surname, Double weight, Double height, Integer age, Double activity){
        userDao.updateUser( id, name, surname, weight,height,age,activity);
    }

    public void deleteUser(Long id){
        userDao.removeUser(id);
    }

    public User getUser(Long id){
      return userDao.getUserById(id);
    }
}

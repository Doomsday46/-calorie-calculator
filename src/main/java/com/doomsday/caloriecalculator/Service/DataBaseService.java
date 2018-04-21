package com.doomsday.caloriecalculator.Service;

import com.doomsday.caloriecalculator.config.JdbcConfig;
import com.doomsday.caloriecalculator.dao.JdbcTemplateUserDao;
import com.doomsday.caloriecalculator.dao.UserDao;
import com.doomsday.caloriecalculator.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataBaseService {

    @Autowired
    private JdbcTemplateUserDao userDao;

    public DataBaseService(){

    }

    public void addUser(String name, String surname,Long param_id){
        userDao.addUser(name,surname,param_id);
    }

    public void updateUser(Long id,String name, String surname,Long param_id){
        userDao.updateUser( id, name,  surname,param_id);
    }

    public void deleteUser(Long id){
        userDao.removeUser(id);
    }

    public User getUser(Long id){
      return userDao.getUserById(id);
    }
}

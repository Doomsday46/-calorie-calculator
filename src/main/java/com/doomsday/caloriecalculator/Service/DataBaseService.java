package com.doomsday.caloriecalculator.Service;

import com.doomsday.caloriecalculator.config.JdbcConfig;
import com.doomsday.caloriecalculator.dao.JdbcTemplateUserDao;
import com.doomsday.caloriecalculator.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;

@Service
public class DataBaseService {

    private JdbcConfig jdbcConfig;
    private DataSource dataSource;
    @Autowired
    private JdbcTemplateUserDao jdbcTemplateUserDao;

    public DataBaseService(){
        jdbcConfig = new JdbcConfig();
        dataSource = jdbcConfig.getDataSource();
    }

    public void addUser(String name, String surname){

    }

    public void updateUser(Long id,String name, String surname){

    }

    public void deleteUser(Long id){

    }

    public User getUser(Long id){
      return null;
    }
}

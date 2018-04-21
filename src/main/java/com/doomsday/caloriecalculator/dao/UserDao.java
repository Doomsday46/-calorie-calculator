package com.doomsday.caloriecalculator.dao;

import com.doomsday.caloriecalculator.entity.User;

import javax.sql.DataSource;
import java.util.List;

public interface UserDao {

     void addUser(String name, String surname, Long param_id);

     User getUserById(Long id);

     void setDataSource(DataSource dataSource);

     List listUsers();

     void removeUser(Long id);

     void updateUser(Long id, String name, String surname, Long param_id);


}

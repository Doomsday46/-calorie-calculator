package com.doomsday.caloriecalculator.dao;

import javax.sql.DataSource;
import java.util.List;

public interface UserDao {

     void setDataSource(DataSource dataSource);

     void addUser(String name, String surname, Long param_id);

     Object getUserById(Long id);

     List listUsers();

     void removeUser(Long id);

     void updateUser(Long id, String name, String surname, Long param_id);


}

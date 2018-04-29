package com.doomsday.caloriecalculator.dao;

import com.doomsday.caloriecalculator.entity.User;
import com.doomsday.caloriecalculator.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository
public class JdbcTemplateUserDao implements UserDao {

    private JdbcTemplate jdbcTemplate;

    public JdbcTemplateUserDao() {

    }

    @Autowired
    @Override
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public void addUser(User user) {
        String SQL = "INSERT INTO USER (name, surname,weight,height,age,activity) VALUES (?,?,?,?,?,?)";

        jdbcTemplate.update(SQL, user.getName(),  user.getSurname(),  user.getWeight(),  user.getHeight(), user.getAge(), user.getActivity());
    }

    @Override
    public User getUserById(Long id) {
        String SQL = "SELECT * FROM USER WHERE id = ?";
        return jdbcTemplate.queryForObject(SQL, new Object[]{id}, new UserMapper());
    }

    @Override
    public List listUsers() {
        String SQL = "SELECT * FROM USER";
        return jdbcTemplate.query(SQL, new UserMapper());
    }

    @Override
    public void removeUser(Long id) {
        String SQL = "DELETE FROM DEVELOPERS WHERE id = ?";
        jdbcTemplate.update(SQL, id);
    }

    @Override
    public void updateUser(Long id, User user) {
        String SQL = "UPDATE DEVELOPERS SET name = ?, surname = ?, weight = ?,height = ?, age = ?, activity = ? WHERE id = ?";
        jdbcTemplate.update(SQL,user.getName(),  user.getSurname(),  user.getWeight(),  user.getHeight(), user.getAge(), user.getActivity(), id);
    }
}

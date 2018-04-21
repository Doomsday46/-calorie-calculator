package com.doomsday.caloriecalculator.dao;

import com.doomsday.caloriecalculator.entity.User;
import com.doomsday.caloriecalculator.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.List;
@Component
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
    public void addUser(String name, String surname, Long param_id) {
        String SQL = "INSERT INTO USER (name, surname, parameter_id) VALUES (?,?,?)";

        jdbcTemplate.update(SQL, name, surname, param_id);
    }

    @Override
    public User getUserById(Long id) {
        String SQL = "SELECT * FROM USER WHERE id = ?";
        return jdbcTemplate.queryForObject(SQL, new Object[]{id}, new UserMapper());
    }

    @Override
    public List listUsers() {
        String SQL = "SELECT * FROM DEVELOPERS";
        return jdbcTemplate.query(SQL, new UserMapper());
    }

    @Override
    public void removeUser(Long id) {
        String SQL = "DELETE FROM DEVELOPERS WHERE id = ?";
        jdbcTemplate.update(SQL, id);
    }

    @Override
    public void updateUser(Long id, String name, String surname, Long param_id) {
        String SQL = "UPDATE DEVELOPERS SET name = ?, surname = ?, parameter_id = ? WHERE id = ?";
        jdbcTemplate.update(SQL, name, surname, param_id, id);
    }
}

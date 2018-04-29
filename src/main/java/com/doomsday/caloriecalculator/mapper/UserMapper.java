package com.doomsday.caloriecalculator.mapper;

import com.doomsday.caloriecalculator.entity.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper implements RowMapper<User> {

    @Override
    public User mapRow(ResultSet resultSet, int i) throws SQLException {
        return new User(resultSet.getLong("id"),
                resultSet.getString("name"),
                resultSet.getString("surname"),
                resultSet.getDouble("weight"),
                resultSet.getDouble("height"),
                resultSet.getInt("age"),
                resultSet.getDouble("activity"));
    }
}

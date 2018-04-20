package com.doomsday.caloriecalculator.config;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

public class JdbcConfig {

    private DataSource dataSource;

    public JdbcConfig(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();

        dataSource.setDriverClassName("org.springframework.spring-jdbc");
        dataSource.setUrl("jdbc:mysql://localhost:3306/dbcalcal");
        dataSource.setUsername("root");
        dataSource.setPassword("");

        this.dataSource = dataSource;
    }

    public DataSource getDataSource() {
        return dataSource;
    }
}

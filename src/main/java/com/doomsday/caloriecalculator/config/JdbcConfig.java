package com.doomsday.caloriecalculator.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
public class JdbcConfig {

    @Bean
    @Primary
    @ConfigurationProperties ("datasource.properties")
    public DataSource getDataSource () {
        return DataSourceBuilder.create().build();
    }
}

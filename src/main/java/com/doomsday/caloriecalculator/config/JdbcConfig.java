package com.doomsday.caloriecalculator.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
@ComponentScan("com.doomsday.caloriecalculator")
public class JdbcConfig {

    @Bean
//    @Primary
//    @ConfigurationProperties ("datasource.properties")
    public DataSource dataSource() {
        return DataSourceBuilder.create().username("root")
                .password("")
                .url("jdbc:mysql://localhost:3306/dbcalcal")
                .driverClassName("com.mysql.jdbc.Driver")
                .build();
    }
}

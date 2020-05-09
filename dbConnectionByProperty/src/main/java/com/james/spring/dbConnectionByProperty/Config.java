package com.james.spring.dbConnectionByProperty;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.james.spring.dbConnectionByProperty")
@PropertySource("classpath:db.connection.values.properties")
public class Config {

}

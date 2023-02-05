package com.springbootdocker;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.metadata.HikariDataSourcePoolMetadata;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zaxxer.hikari.HikariDataSource;

@SpringBootApplication
@RestController
public class SpringBootDockerApplication {

    @Autowired
    private DataSource dataSource;

    @GetMapping("hello")
    public String helloDocker() {
        Integer idleConnection = new HikariDataSourcePoolMetadata((HikariDataSource) dataSource).getIdle();
        return "Hello Docker! Idle connection to database is " + idleConnection;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDockerApplication.class, args);
    }

}

package com.example.happy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.example.happy.mapper")
@SpringBootApplication

public class HappyApplication {

    public static void main(String[] args) {
        SpringApplication.run(HappyApplication.class, args);
    }

}

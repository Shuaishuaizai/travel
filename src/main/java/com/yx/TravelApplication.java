package com.yx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yx.dao")
public class TravelApplication {
    public static void main(String[] args) {
        SpringApplication.run(TravelApplication.class,args);
    }
}

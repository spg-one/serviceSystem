package com.adufeitian.servicesystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
@MapperScan("com.adufeitian.servicesystem.mybatis.mapper")
public class ServicesystemApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServicesystemApplication.class, args);
    }

}

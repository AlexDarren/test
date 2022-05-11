package com.sushangjin.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class StudentMain {
    public static void main(String[] args) {
        SpringApplication.run(StudentMain.class, args);
    }
}

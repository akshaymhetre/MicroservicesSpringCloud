package com.akshay.learning.microservices.employee.create;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@EnableDiscoveryClient
@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan
public class EmployeeCreateApplication {
    public static void main(String[] args) {
        SpringApplication.run(EmployeeCreateApplication.class, args);
    }
}

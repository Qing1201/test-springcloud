package com.example.journalservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages="com.example.journalservice")
public class JournalserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(JournalserviceApplication.class, args);
    }

}

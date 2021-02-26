package com.ricemarch.chapter5feignservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Chapter5FeignServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Chapter5FeignServiceApplication.class, args);
    }

}

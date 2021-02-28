package com.ricemarch.chapter6hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableCircuitBreaker //开启Hystrix
@EnableFeignClients
public class Chapter6HystrixApplication {

    public static void main(String[] args) {
        SpringApplication.run(Chapter6HystrixApplication.class, args);
    }

    //注入可以进行负载均衡的RestTemplate
    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

}

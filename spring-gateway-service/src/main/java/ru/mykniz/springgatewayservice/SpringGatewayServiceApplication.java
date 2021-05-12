package ru.mykniz.springgatewayservice;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
public class SpringGatewayServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringGatewayServiceApplication.class, args);
    }

}




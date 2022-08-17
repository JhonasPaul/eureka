package com.example.efjonathanortizeurekacliente;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer
@SpringBootApplication
public class EfJonathanOrtizEurekaClienteApplication {

    public static void main(String[] args) {
        SpringApplication.run(EfJonathanOrtizEurekaClienteApplication.class, args);
    }

}

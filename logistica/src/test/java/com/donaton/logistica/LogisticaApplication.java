package com.donaton.logistica;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableRabbit
public class LogisticaApplication {

    public static void main(String[] args) {
        SpringApplication.run(LogisticaApplication.class, args);
    }

}
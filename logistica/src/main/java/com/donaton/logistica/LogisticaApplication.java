package com.donaton.logistica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.donaton.logistica.repository")
@EntityScan(basePackages = "com.donaton.logistica.entity")
public class LogisticaApplication {

    public static void main(String[] args) {
        SpringApplication.run(LogisticaApplication.class, args);
    }
}


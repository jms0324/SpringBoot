package com.example.umc4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class Umc4Application {

    public static void main(String[] args) {
        SpringApplication.run(Umc4Application.class, args);
    }

}

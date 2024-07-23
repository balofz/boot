package com.jt2024.boot.v7.schedule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Application {

        public static void main(String[] args) {
            SpringApplication.run(Application.class, args);
        }
}

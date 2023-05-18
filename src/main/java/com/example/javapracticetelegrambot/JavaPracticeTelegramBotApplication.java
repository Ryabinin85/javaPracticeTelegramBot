package com.example.javapracticetelegrambot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class JavaPracticeTelegramBotApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaPracticeTelegramBotApplication.class, args);
    }

}

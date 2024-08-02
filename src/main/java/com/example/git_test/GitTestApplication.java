package com.example.git_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitTestApplication {

    public static void main(String[] args) {
        System.out.println("new line");
        System.out.println("new line2");
        System.out.println("new line3");
        SpringApplication.run(GitTestApplication.class, args);
    }

}

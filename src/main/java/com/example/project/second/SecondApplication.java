package com.example.project.second;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SecondApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecondApplication.class, args);
        double a = 200;
        double b = 0;
        b = a%2==0 ? a/4:a*2;//ternary operator
        System.out.println(b);
    }

}

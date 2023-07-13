package com.example.week_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class Application {

    public static void main(String[] args) {
        boolean isTrue = true;
        int number = 1234;
        double realNumber = 3.14;
        String str = "Hello world!!";

        System.out.println(isTrue);
        System.out.println(number);
        System.out.println(realNumber);
        System.out.println(str);

        int grade = 100;

        if(grade >= 90) {
            System.out.println("A");
        }
        else if(grade >= 80) {
            System.out.println("B");
        }
        else if(grade >= 70) {
            System.out.println("C");
        }
        else if(grade >= 60) {
            System.out.println("D");
        }
        else {
            System.out.println("F");
        }
    }
}

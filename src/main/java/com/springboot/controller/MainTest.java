package com.springboot.controller;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = {"com.springboot.controller","com.springboot.business"})
public class MainTest {
    public static void main(String args[]) {
 System.out.print("dbsadbsakjdhsahdsajdsaj");
        SpringApplication.run(MainTest.class,args);

    }
}


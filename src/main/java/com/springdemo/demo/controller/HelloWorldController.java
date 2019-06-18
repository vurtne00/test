package com.springdemo.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping("helloWorld")
    public String hello(){
        for (int i = 0; i < 5; i++) {
            int d = 2;
            int c = d+1;
            System.out.println("i="+i);
            System.out.println("i="+i);
            System.out.println("i="+i);
            System.out.println("i="+i);
            System.out.println("i="+i);
        }
        return "helloWorld";
    }
}

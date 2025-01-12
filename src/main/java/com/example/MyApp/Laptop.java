package com.example.MyApp;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary // Use when on interface is implemented by 2 class and have same method.
public class Laptop implements Computer {
    public void compile(){
        System.out.println("Compiling on laptop");
    }
}

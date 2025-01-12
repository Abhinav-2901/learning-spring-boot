package com.example.MyApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    //Field Injection (@Autowired is mandatory)
    @Autowired
//    @Qualifier("laptop") // Use when on interface is implemented by 2 class and have same method. (if not set @Primary)
    private Computer comp;

    //Setter Injection (@Autowired is mandatory)
//    @Autowired
//    public void setLaptop(Laptop laptop){
//        this.laptop = laptop;
//    }

    // Construction Injection (@Autowired is not mandatory)
//    public Dev(Laptop laptop){
//        this.laptop = laptop;
//    }

    public void build(){
        comp.compile();
        System.out.println("Building Awesome Project");
    }
}

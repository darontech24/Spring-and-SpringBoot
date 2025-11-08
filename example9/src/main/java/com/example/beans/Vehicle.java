package com.example.beans;

import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

public class Vehicle {
    public Vehicle(){
        System.out.println("Vehicle has been initialized!");
    }
    private String name = "Toyota";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Line Before destroying the Vehicle Bean");
    }

    public void printHello(){
        System.out.println("Inside the vehicle component");
    }

    @Override
    public String toString(){
        return "Vehicle name is : "+name;
    }
}

package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private final Vehicle vehicle;

    @Autowired
    public Person(@Qualifier("vehicle1") Vehicle vehicle1){
        System.out.println("Person class has been initialized");
        this.vehicle = vehicle1;
    }

    private String name = "LostBoy";

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Vehicle getVehicle(){
        return vehicle;
    }

//    @Autowired
//    public void setVehicle(Vehicle vehicle){
//        this.vehicle = vehicle;
//    }
}

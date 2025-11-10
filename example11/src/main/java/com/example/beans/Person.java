package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private final Vehicle vehicle;

    @Autowired
    public Person(Vehicle vehicle1){
        System.out.println("Person class has been initialized and autowired to Vehicle class");
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


}

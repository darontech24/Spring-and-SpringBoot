package com.example.beans;

public class Vehicle {
    public Vehicle(){
        System.out.print("Vehicle class has been initialized");
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printHello(){
        System.out.println("Inside the vehicle component");
    }

    @Override
    public String toString(){
        return "Vehicle name is - "+name;
    }
}

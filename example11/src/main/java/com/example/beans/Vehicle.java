package com.example.beans;

import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {
    private VehicleService vehServ;

    @Autowired
    public Vehicle(VehicleService vehServ){
        this.vehServ = vehServ;
        System.out.println("Vehicle has been initialized and autowired to VehicleServices!");
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

    public VehicleService getVehicleServices(){
        return vehServ;
    }
}

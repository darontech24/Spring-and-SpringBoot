package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;
import java.util.function.Supplier;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Example7 {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle audiVehicle = new Vehicle();
        audiVehicle.setName("Audi");
        Supplier<Vehicle> audiSupplier = () -> audiVehicle;

        Supplier<Vehicle> bmwSupplier = () -> {
            Vehicle bmwVehicle = new Vehicle();
            bmwVehicle.setName("BMW");
            return bmwVehicle;
        };

        Random random = new Random();
        int randomNumber = random.nextInt(10);
        System.out.println(randomNumber);
        if(randomNumber%2==0){
            context.registerBean("audi", Vehicle.class, audiSupplier);
        }else{
            context.registerBean("bmw", Vehicle.class, bmwSupplier);
        }

        Vehicle audi = null;
        Vehicle bmw = null;

        try{
            audi = context.getBean(Vehicle.class); //Try with only Vehicle
            System.out.println(audi.getName());
        }catch(NoSuchBeanDefinitionException e){
            System.out.println("Audi Bean was not found : "+e);
        }

        try{
            bmw = context.getBean("bmw", Vehicle.class);
            System.out.println(bmw.getName());
        }catch (NoSuchBeanDefinitionException e){
            System.out.println("BMW Bean was not found : "+e);
        }

    }
}
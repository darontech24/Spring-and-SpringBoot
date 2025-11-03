package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {

    @Bean
    Vehicle vehicle1(){
        Vehicle veh = new Vehicle();
        veh.setName("Audi");
        return veh;
    }

    @Primary
    @Bean(name="BMW")
    Vehicle vehicle2(){
        Vehicle veh = new Vehicle();
        veh.setName("BMW");
        return veh;
    }

    @Bean("Cadillac")
    Vehicle vehicle3(){
        Vehicle veh = new Vehicle();
        veh.setName("Cadillac");
        return veh;
    }
}

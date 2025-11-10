package com.example.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Bose implements Speakers{
    @Override
    public void makeSound() {
        System.out.println("Bose(Primary Speakers Bean) playing sound");
    }
}

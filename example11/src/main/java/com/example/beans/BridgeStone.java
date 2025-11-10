package com.example.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BridgeStone implements Tyres{
    public void rotate(){
        System.out.println("Bridgestone(Primary Tyre Bean) tyre is rotating!");
    }
}

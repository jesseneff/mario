package com.jesse.mario;

public class ConsoleStrategy implements OutputStrategy {
    public void output(Pyramid pyramid){
        System.out.println(pyramid.toString());
    }
}
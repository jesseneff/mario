package com.mario;

public class ConsoleStrategy implements OutputStrategy {
    @Override
    public void output(Pyramid pyramid){
        System.out.println(pyramid.toString());
    }
}
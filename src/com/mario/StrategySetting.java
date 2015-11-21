package com.mario;

import java.util.ArrayList;

public class StrategySetting {
    private OutputStrategy strategy;

    public StrategySetting(OutputStrategy strategy){
        this.strategy = strategy;
    }

    public void output(ArrayList<String> lines){
        this.strategy.output(lines);
    }
}
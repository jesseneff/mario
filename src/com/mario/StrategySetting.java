package com.mario;

public class StrategySetting implements OutputStrategy {
    private OutputStrategy strategy;

    public StrategySetting(OutputStrategy strategy){
        this.strategy = strategy;
    }

    public void output(Pyramid pyramid){
        this.strategy.output(pyramid);
    }
}
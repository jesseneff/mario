package com.mario;

/**
 * Created by Jesse on 11/25/2015.
 */
public class StrategyFactory {
    public OutputStrategy GetStrategy(String strategy){
        if (strategy.equals("file")){
            return new StrategySetting(new FileStrategy());
        }
        else {
            return new StrategySetting(new ConsoleStrategy());
        }
    }

}

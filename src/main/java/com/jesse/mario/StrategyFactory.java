package com.jesse.mario;

/**
 * Created by Jesse on 11/25/2015.
 */
public class StrategyFactory {

    private StrategyFactory(){}

    private static StrategyFactory factory;

    public static StrategyFactory getInstance(){
        if (factory == null){
            factory = new StrategyFactory();
            }
        return factory;
    }

    public OutputStrategy fileStrategy(){
        return new FileStrategy();
    }

    public OutputStrategy consoleStrategy(){
        return new ConsoleStrategy();
    }


}

package com.shane.structural.flyweight;

/**
 * Created by SHANE on 2015/09/10.
 */
public class FlyweightAdder implements FlyweightCalculator{
    String command;

    public FlyweightAdder() {
        command="add";
        try
        {
            Thread.sleep(3000);
        }

        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public double doSomething(double x, double y) {
        return (x+y);
    }
}

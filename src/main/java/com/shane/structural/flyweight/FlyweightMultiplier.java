package com.shane.structural.flyweight;

/**
 * Created by SHANE on 2015/09/10.
 */
public class FlyweightMultiplier implements FlyweightCalculator {
    String command;

    public FlyweightMultiplier() {
        command="multiply";
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
        return (x*y);
    }
}

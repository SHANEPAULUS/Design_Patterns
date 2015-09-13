package com.shane.creational.abstractfactory;

/**
 * Created by SHANE on 2015/09/08.
 */
public class JapanFactory extends CarFactory {
    @Override
    public Car getCar(String engine) {
        if(engine=="ZF10")
        {
            return new Toyota();
        }
        else
            return null;//Only have one "Japan" model for this Country..
    }
}

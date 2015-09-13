package com.shane.creational.abstractfactory;

/**
 * Created by SHANE on 2015/03/11.
 */
public class BMW extends Car {
    @Override
    public String engine() {
        return "M52B28";
    }

    @Override
    public String name() {
        return "BMW E36 328I";
    }
}

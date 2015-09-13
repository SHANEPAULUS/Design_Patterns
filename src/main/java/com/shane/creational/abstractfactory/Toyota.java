package com.shane.creational.abstractfactory;

/**
 * Created by SHANE on 2015/03/11.
 */
public class Toyota extends Car {
    @Override
    public String engine() {
        return "ZF10";
    }

    @Override
    public String name() {
        return "Toyota Supra 3.0";
    }
}

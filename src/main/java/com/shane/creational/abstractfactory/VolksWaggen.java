package com.shane.creational.abstractfactory;

/**
 * Created by SHANE on 2015/03/11.
 */
public class VolksWaggen extends Car {
    @Override
    public String engine() {
        return "VR6";
    }

    @Override
    public String name() {
        return "VW Golf R32";
    }
}

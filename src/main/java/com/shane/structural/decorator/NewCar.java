package com.shane.structural.decorator;

/**
 * Created by SHANE on 2015/03/13.
 */
public class NewCar implements Car {
    @Override
    public String description() {
        return "This is a brand new car.";
    }
}

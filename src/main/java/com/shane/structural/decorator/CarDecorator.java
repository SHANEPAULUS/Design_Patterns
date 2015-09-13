package com.shane.structural.decorator;

/**
 * Created by SHANE on 2015/03/13.
 */
public abstract class CarDecorator implements Car {
    Car car;

    public CarDecorator(Car car) {
        this.car = car;
    }
}

package com.shane.creational.builder;

/**
 * Created by SHANE on 2015/03/11.
 */
public class CarDirector {

    private CarBuilder carBuilder=null;

    public CarDirector(CarBuilder carBuilder)
    {
        this.carBuilder=carBuilder;
    }

    public void constructCar()
    {
        carBuilder.buildMake();
        carBuilder.buildEngine();
        carBuilder.buildYear();
    }

    public Car getCar()
    {
        return carBuilder.getCar();
    }
}

package com.shane.creational.builder;

/**
 * Created by SHANE on 2015/03/11.
 */
public class MazdaBuilder implements CarBuilder {
    private Car car;
    @Override
    public void buildMake() {
        car.setMake("MX 5");
    }

    @Override
    public void buildYear() {
        car.setYear(2013);
    }

    @Override
    public void buildEngine() {
        car.setEngineSize(2579);
    }

    @Override
    public Car getCar() {
        return car;
    }
}

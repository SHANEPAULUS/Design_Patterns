package com.shane.creational.builder;

/**
 * Created by SHANE on 2015/03/11.
 */
public class BMWBuilder implements CarBuilder {
    private Car car;

    public BMWBuilder()
    {
        car=new Car();
    }

    @Override
    public void buildMake() {
        car.setMake("BMW f30 335i");
    }

    @Override
    public void buildYear() {
        car.setYear(2014);
    }

    @Override
    public void buildEngine() {
        car.setEngineSize(2979);
    }

    @Override
    public Car getCar() {
        return car;
    }

}

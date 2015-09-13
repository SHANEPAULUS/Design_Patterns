package com.shane.structural.decorator;

/**
 * Created by SHANE on 2015/03/13.
 */
public class SportEngineDecorator extends CarDecorator {
    public SportEngineDecorator(Car car) {
        super(car);
    }
    @Override
    public String description()
    {
        race();
        return ("This car has a powerful engine.");
    }

    public void race()
    {
        System.out.println("Car is racing...");
    }
}

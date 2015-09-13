package com.shane.structural.decorator;

/**
 * Created by SHANE on 2015/03/13.
 */
public class SportWheelDecorator extends CarDecorator {
    public SportWheelDecorator(Car car) {
        super(car);
    }

    @Override
    public String description()
    {
        drift();
        return "This car has sport wheels.";
    }

    public void drift()
    {
        System.out.println("Car is drifting...");
    }

}

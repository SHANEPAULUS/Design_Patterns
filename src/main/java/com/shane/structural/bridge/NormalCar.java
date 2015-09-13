package com.shane.structural.bridge;

/**
 * Created by SHANE on 2015/03/13.
 */
public class NormalCar extends Vehicle {
    public NormalCar(Engine engine) {
        this.engine=engine;
        this.weight=300;
    }

    @Override
    public void drive() {
        System.out.println("Normal car is driving");
        int hp=engine.go();
        reportSpeed(hp);
    }
}

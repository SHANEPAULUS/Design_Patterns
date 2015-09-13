package com.shane.structural.bridge;

/**
 * Created by SHANE on 2015/03/13.
 */
public abstract class Vehicle {
    Engine engine;
    int weight;
    String speed;
    public abstract void drive();

    public void setEngine(Engine engine)
    {
        this.engine=engine;
    }

    public void reportSpeed(int hp)
    {
        int ratio=weight/hp;
        if(ratio<3)
            speed=("Vehicle is going fast");
        else if(ratio>=3&&ratio<8)
            speed=("Vehicle is driving at an average speed");
        else  speed=("Vehicle is going slow");
    }

    public String getSpeed() {
        return speed;
    }
}

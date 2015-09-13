package com.shane.structural.composite;

/**
 * Created by SHANE on 2015/09/09.
 */
public class Car implements Engine{
    String name;
    String goStatus;
    String offStatus;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public void go() {
        this.goStatus=name+" car engine is running";
    }

    @Override
    public void off() {
        this.offStatus=name+" car engine is off";
    }

    public String getName() {
        return name;
    }

    public String getGoStatus() {
        return goStatus;
    }

    public String getOffStatus() {
        return offStatus;
    }
}

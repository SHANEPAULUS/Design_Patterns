package com.shane.creational.builder;

/**
 * Created by SHANE on 2015/03/11.
 */
public interface CarBuilder {
    public void buildMake();
    public void buildYear();
    public void buildEngine();
    public Car getCar();
}

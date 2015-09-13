package com.shane.creational.abstractfactory;

/**
 * Created by SHANE on 2015/09/08.
 */
public class AbstractFactory {
    public CarFactory getCarFactory(String country)
    {
        if(country=="Germany")
        {
            return new GermanFactory();
        }
        else
            return new JapanFactory();
    }
}

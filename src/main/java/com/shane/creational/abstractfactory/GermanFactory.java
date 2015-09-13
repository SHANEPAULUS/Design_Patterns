package com.shane.creational.abstractfactory;

/**
 * Created by SHANE on 2015/09/08.
 */
public class GermanFactory extends CarFactory {
    @Override
    public Car getCar(String engine) {
        if(engine=="M52B28")
        {
            return new BMW();
        }
        else
            return new VolksWaggen();
    }
}

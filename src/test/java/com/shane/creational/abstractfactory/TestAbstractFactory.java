package com.shane.creational.abstractfactory;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by SHANE on 2015/09/08.
 */
public class TestAbstractFactory {
    private AbstractFactory abstractFactory;
    private CarFactory carFactory1;
    private CarFactory carFactory2;

    private Car c1;
    private Car c2;
    private Car c3;

    @Test
    public void testAbstractFactory() throws Exception {
        abstractFactory=new AbstractFactory();
        carFactory1=abstractFactory.getCarFactory("Germany");
        c1=carFactory1.getCar("M52B28");
        c3=carFactory1.getCar("VR6");

        carFactory2=abstractFactory.getCarFactory("Japan");
        c2=carFactory2.getCar("ZF10");

        Assert.assertTrue(c1.name()=="BMW E36 328I");
        Assert.assertEquals(c2.name(),"Toyota Supra 3.0");
        Assert.assertTrue(c3.name()=="VW Golf R32");
    }
}

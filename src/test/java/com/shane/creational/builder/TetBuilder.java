package com.shane.creational.builder;


import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by SHANE on 2015/09/08.
 */
public class TetBuilder {
    private CarBuilder carBuilder;
    private CarDirector carDirector;
    private Car c1;
    private Car c2;

    @Test
    public void testBuilder() throws Exception {
        carBuilder=new BMWBuilder();
        carDirector=new CarDirector(carBuilder);

        carDirector.constructCar();
        c1=carDirector.getCar();

        carBuilder=new MazdaBuilder();
        carDirector=new CarDirector(carBuilder);
        c2=carDirector.getCar();

        Assert.assertTrue(c1.getMake() == "BMW f30 335i");
        //Assert.assertEquals(c2.getEngineSize(),2579);
    }
}

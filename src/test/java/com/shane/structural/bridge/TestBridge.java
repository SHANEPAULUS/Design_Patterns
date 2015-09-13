package com.shane.structural.bridge;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by SHANE on 2015/09/10.
 */
public class TestBridge {
    Vehicle normal;
    Vehicle sport;


    @Test
    public void testBridge() throws Exception {
        normal=new NormalCar(new NormalEngine());
        sport=new SportCar(new SportEngine());

        normal.drive();
        sport.drive();
        Assert.assertTrue(normal.getSpeed()=="Vehicle is going fast");
        Assert.assertTrue(sport.getSpeed()=="Vehicle is going fast");

        sport=new SportCar(new NormalEngine());
        //Assert.assertTrue(sport.getSpeed()=="Vehicle is driving at an average speed");
    }
}

package com.shane.structural.decorator;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by SHANE on 2015/09/10.
 */
public class TestDecorator {
    Car car1;

    @Test
    public void testDecorator() throws Exception {
        car1=new NewCar();
        Assert.assertEquals("This is a brand new car.",car1.description());

        car1=new SportEngineDecorator(car1);
        Assert.assertEquals("This car has a powerful engine.",car1.description());

        car1=new SportWheelDecorator(car1);
        Assert.assertEquals("This car has sport wheels.",car1.description());
    }
}

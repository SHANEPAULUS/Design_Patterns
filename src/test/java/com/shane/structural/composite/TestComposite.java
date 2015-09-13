package com.shane.structural.composite;

import com.shane.structural.composite.Car;
import com.shane.structural.composite.Composite;
import junit.framework.Assert;
import org.junit.Test;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by SHANE on 2015/09/09.
 */
public class TestComposite {
    Car car1=new Car("Normal");
    Car car2=new Car("Sport");
    Car car3=new Car("Super");
    Car car4=new Car("Luxury");
    Car car5=new Car("Prototype");

    Composite composite1=new Composite();
    Composite composite2=new Composite();
    Composite composite3=new Composite();

    @Test
    public void testComposite1() throws Exception {
        composite1.add(car1);
        composite1.add(car2);

        //Testing the 1st car on go..
        car1.go();
        Assert.assertEquals("Normal car engine is running",car1.getGoStatus());
        //Testing the entire composite 1 on go
        composite1.go();
        Assert.assertEquals("Normal car engine is running",car1.getGoStatus());
        Assert.assertEquals("Sport car engine is running",car2.getGoStatus());

    }

    @Test
    public void testComposite2() throws Exception {
        composite2=new Composite();
        composite2.add(car3);
        composite2.add(car4);
        //Testing composite2 on off..
        composite2.off();
        Assert.assertEquals("Super car engine is off",car3.getOffStatus());
        Assert.assertEquals("Luxury car engine is off",car4.getOffStatus());

    }

    @Test
    public void testComposite3() throws Exception {
        composite3=new Composite();
        composite3.add(composite1);
        composite3.add(composite2);
        composite3.add(car5);
        //Switching all vehicles off..those in composite1,composite2 and 3
        composite3.off();
        //Assert.assertEquals("Normal car engine is off",car1.getOffStatus());
        Assert.assertEquals("Prototype car engine is off",car5.getOffStatus());

    }
}

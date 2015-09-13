package com.shane.structural.flyweight;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by SHANE on 2015/09/10.
 */
public class TestFlyweight {
    FlyweightFactory flyweightFactory;

    @Test
    public void testFlyweight() throws Exception {
        flyweightFactory=FlyweightFactory.getInstance();

        FlyweightCalculator add=flyweightFactory.getFlyweight("add");
        FlyweightCalculator multiply=flyweightFactory.getFlyweight("aasd");

        double ans=add.doSomething(2,2);
        double ans2=multiply.doSomething(2,2);
        Assert.assertEquals(4.0,ans);
        Assert.assertEquals(4.0,ans2);
    }
}

package com.shane.structural.facade;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by SHANE on 2015/09/10.
 */
public class TestFacade {
    Facade facade;

    @Test
    public void testFacade() throws Exception {
        facade=new Facade();
        int x=3;
        Assert.assertTrue(facade.cubeX(x)==27);
        Assert.assertTrue(facade.cubeXTimes2(x)==54);
        Assert.assertTrue(facade.xToSixthPower(x)==1458);
    }
}

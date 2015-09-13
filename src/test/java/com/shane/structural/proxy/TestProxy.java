package com.shane.structural.proxy;

import junit.framework.Assert;
import org.junit.Test;

import java.util.Date;

/**
 * Created by SHANE on 2015/09/10.
 */
public class TestProxy {
    Proxy proxy;
    Jet jet;

    @Test
    public void testProxy() throws Exception {
        proxy=new Proxy();

        jet=new Jet();
        String jetStatus=jet.takeOff();
        Assert.assertEquals("Jet is taking off at "+new Date(),jetStatus);
        //5 seconds later the courier plane is taking off..
        String courierStatus=proxy.takeOff();
        Assert.assertEquals("Courier is taking off at "+new Date(),courierStatus);
    }
}

package com.shane.structural.proxy;

import java.util.Date;

/**
 * Created by SHANE on 2015/03/12.
 */
public class Proxy {
   Courier courier;

    public Proxy() {
        System.out.println("Creating proxy at " + new Date());
    }

    public String takeOff()
    {
        if(courier==null)
        {
            courier=new Courier();
        }

        return courier.takeOff();
    }
}

package com.shane.structural.proxy;

/**
 * Created by SHANE on 2015/09/10.
 */
public class Courier extends Plane {

    public Courier() {
        try
        {
            Thread.sleep(5000);
        }

        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}

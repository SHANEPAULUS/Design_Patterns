package com.shane.structural.proxy;

import java.util.Date;

/**
 * Created by SHANE on 2015/03/12.
 */
public abstract class Plane {
    public String takeOff()
    {
        return this.getClass().getSimpleName()+" is taking off at "+new Date();
    }
}

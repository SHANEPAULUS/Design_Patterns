package com.shane.structural.facade;

/**
 * Created by SHANE on 2015/03/13.
 */
public class Class3 {
    public int doMoreStuff(Class1 c1,Class2 c2,int x)
    {
        return c1.doSomethingComplicated(x)*c2.doAnotherThing(c1,x);
    }
}

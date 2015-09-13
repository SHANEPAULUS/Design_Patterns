package com.shane.structural.facade;

/**
 * Created by SHANE on 2015/03/13.
 */
public class Class2 {
    public int doAnotherThing(Class1 class1,int x)
    {
        return 2*class1.doSomethingComplicated(x);
    }
}

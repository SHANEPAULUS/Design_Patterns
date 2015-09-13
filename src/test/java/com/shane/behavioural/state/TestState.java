package com.shane.behavioural.state;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by SHANE on 2015/09/13.
 */
public class TestState {
    Person person;

    @Test
    public void testState() throws Exception {
        person=new Person(new StrongSate());
        Assert.assertEquals("I am excited to walk",person.walk());

        person.setEnergyState(new WeakState());
        Assert.assertEquals("Not now, I am too tired to walk",person.walk());
    }
}

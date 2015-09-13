package com.shane.creational.prototype;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by SHANE on 2015/09/08.
 */
public class TestPrototype {
    private Teacher t1;
    private Teacher t2;

    @Test
    public void testTeacher() throws Exception {
        t1=new Teacher("Zwiegers");
        t2=(Teacher)t1.copy();

        Assert.assertTrue(t1.getName()==t2.getName());
    }
}

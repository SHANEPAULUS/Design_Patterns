package com.shane.creational.factory;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by SHANE on 2015/09/08.
 */
public class TestFactory {
    private DogFactory dogFactory;
    private Dog bulldog;
    private Dog puppy;

    @Test
    public void testFactory() throws Exception {
        dogFactory=new DogFactory();
        bulldog=dogFactory.getDog("Bulldog");
        puppy=dogFactory.getDog("Puppy");

        Assert.assertEquals(puppy.speak(),"I am a puppy");
        Assert.assertEquals(bulldog.speak(),"I am a Bulldog");
    }
}

package com.shane.behavioural.strategy;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by SHANE on 2015/09/13.
 */
public class TestStrategy {
    int year=2015;
    Strategy latest;
    Strategy vintage;
    Context ctx;

    @Test
    public void testStrategy() throws Exception {
        latest=new LatestStategy();
        ctx=new Context(year,latest);
        vintage=new VintageStrategy();

        Assert.assertTrue(ctx.getResult());
        ctx.setStrategy(vintage);

        Assert.assertFalse(ctx.getResult());

    }
}

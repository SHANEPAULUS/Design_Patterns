package com.shane.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by SHANE on 2015/09/10.
 */
public class FlyweightFactory {

    private static FlyweightFactory flyweightFactory;

    private Map<String,FlyweightCalculator> flyweightPool;

    private FlyweightFactory()
    {
        flyweightPool=new HashMap<String, FlyweightCalculator>();
    }

    public static FlyweightFactory getInstance()
    {
        if(flyweightFactory==null)
        {
            flyweightFactory=new FlyweightFactory();
        }

        return flyweightFactory;
    }

    public FlyweightCalculator getFlyweight(String key)
    {
        if(flyweightPool.containsKey(key))
        {
            return flyweightPool.get(key);
        }

        else {
            FlyweightCalculator flyweightCalculator;
            if ("add".equals(key)) {
                flyweightCalculator = new FlyweightAdder();
            }
            else
            {
                flyweightCalculator = new FlyweightMultiplier();
            }
            flyweightPool.put(key,flyweightCalculator);
            return flyweightCalculator;
        }
    }
}

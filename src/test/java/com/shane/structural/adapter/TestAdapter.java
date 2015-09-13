package com.shane.structural.adapter;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by SHANE on 2015/09/08.
 */
public class TestAdapter {
    private DistanceInfo distanceInfo;

    @Test
    public void testAdapter() throws Exception {
        distanceInfo=new DistanceClassReporter();
        distanceInfo.setDistanceInKm(100);
        Assert.assertEquals(62.0,distanceInfo.getDistanceInMi());

        distanceInfo=new DistanceObjectReporter();
        distanceInfo.setDistanceInMi(62.0);
        Assert.assertEquals(100.0,distanceInfo.getDistanceInKm());
    }
}

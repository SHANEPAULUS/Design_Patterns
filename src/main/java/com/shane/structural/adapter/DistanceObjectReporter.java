package com.shane.structural.adapter;

/**
 * Created by SHANE on 2015/09/08.
 */
public class DistanceObjectReporter implements DistanceInfo {

    KmReporter kmReporter;

    public DistanceObjectReporter() {
        kmReporter=new KmReporter();
    }

    @Override
    public double getDistanceInKm() {
        return kmReporter.getDistanceInKm();
    }

    @Override
    public void setDistanceInKm(double distanceInKm) {
        kmReporter.setDistanceInKm(distanceInKm);
    }

    @Override
    public double getDistanceInMi() {
        return KmToMi(kmReporter.getDistanceInKm());
    }

    @Override
    public void setDistanceInMi(double distanceInMi) {
        kmReporter.setDistanceInKm(MiToKm(distanceInMi));
    }

    private double MiToKm(double mi)
    {
        return ((double)Math.round(mi*1.609344));
    }

    private double KmToMi(double km)
    {
        return ((double)Math.round(km/1.609344));
    }


}

package com.shane.structural.adapter;

/**
 * Created by SHANE on 2015/09/08.
 */
public class DistanceClassReporter extends KmReporter implements DistanceInfo {
    @Override
    public double getDistanceInKm() {
        return distanceInKm;
    }

    @Override
    public void setDistanceInKm(double distanceInKm) {
        this.distanceInKm=distanceInKm;
    }

    @Override
    public double getDistanceInMi() {
        return KmToMi(getDistanceInKm());
    }

    @Override
    public void setDistanceInMi(double distanceInMi) {
        this.distanceInKm=MiToKm(distanceInMi);
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

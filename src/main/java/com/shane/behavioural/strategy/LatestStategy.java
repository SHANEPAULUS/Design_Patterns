package com.shane.behavioural.strategy;

/**
 * Created by SHANE on 2015/03/13.
 */
public class LatestStategy implements Strategy {
    @Override
    public boolean checkMovie(int year) {
        if(year>2010&&year<2016)
            return true;
        else
            return false;
    }
}

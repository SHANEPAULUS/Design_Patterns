package com.shane.behavioural.strategy;

/**
 * Created by SHANE on 2015/03/13.
 */
public class VintageStrategy implements Strategy {
    @Override
    public boolean checkMovie(int year) {
        if(year>1940&&year<1980)
            return true;
        else
            return false;
    }
}

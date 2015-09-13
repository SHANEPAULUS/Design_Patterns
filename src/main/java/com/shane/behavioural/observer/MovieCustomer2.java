package com.shane.behavioural.observer;

/**
 * Created by SHANE on 2015/03/13.
 */
public class MovieCustomer2 implements MovieObserver {
    @Override
    public void doUpdate(String title) {
        System.out.println("Movie customer 2 found out that the latest title is "+title);
    }
}

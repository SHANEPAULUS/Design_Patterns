package com.shane.behavioural.observer;

/**
 * Created by SHANE on 2015/03/13.
 */
public class MovieCustomer1 extends MovieCustomer implements MovieObserver {

    @Override
    public void doUpdate(String title) {
        System.out.println("Movie customer 1 found out that the latest title is "+title);
    }
}

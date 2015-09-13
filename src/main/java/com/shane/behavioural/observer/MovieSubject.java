package com.shane.behavioural.observer;

/**
 * Created by SHANE on 2015/03/13.
 */
public interface MovieSubject {
    public void addObserver(MovieObserver movieObserver);
    public void removeObserver(MovieObserver movieObserver);
    public void doNotify();
}

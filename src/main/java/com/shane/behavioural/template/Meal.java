package com.shane.behavioural.template;

/**
 * Created by SHANE on 2015/03/13.
 */
public abstract class Meal {
    public final void doMeal(){
        prepareIngedrients();
        cook();
        eat();
        cleanUp();
    }

    public abstract void prepareIngedrients();
    public abstract void cook();
    public void eat()
    {
        System.out.println("Eating my meal");
    }
    public abstract void cleanUp();
}

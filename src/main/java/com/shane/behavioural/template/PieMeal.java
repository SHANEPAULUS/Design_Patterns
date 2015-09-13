package com.shane.behavioural.template;

/**
 * Created by SHANE on 2015/03/13.
 */
public class PieMeal extends Meal {
    @Override
    public void prepareIngedrients() {
        System.out.println("Getting dough, kidneys, steak, sauce");
    }

    @Override
    public void cook() {
        System.out.println("Cooking up the sauce, baking the pie in oven");
    }

    @Override
    public void cleanUp() {
        System.out.println("Washing the dishes");
    }
}

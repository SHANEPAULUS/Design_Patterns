package com.shane.behavioural.template;

/**
 * Created by SHANE on 2015/03/13.
 */
public class Braai extends Meal {
    @Override
    public void prepareIngedrients() {
        System.out.println("Spicing the chops, sausages and salad");
    }

    @Override
    public void cook() {
        System.out.println("Turning the chops and sausages every 2minutes");
    }

    @Override
    public void eat()
    {
        System.out.println("This Braai is delicious");
    }
    @Override
    public void cleanUp() {
        System.out.println("Cleaning the plates");
    }
}

package com.shane.creational.factory;

/**
 * Created by SHANE on 2015/03/11.
 */
public class DogFactory {

    public Dog getDog(String type)
    {
        if("Pitbull".equals(type))
        {
            return new PitBull();
        }
        else if("Bulldog".equals(type))
        {
            return new BullDog();
        }

        else
            return new Puppy();
    }
}

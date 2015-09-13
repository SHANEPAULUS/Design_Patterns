package com.shane.behavioural.state;

/**
 * Created by SHANE on 2015/03/13.
 */
public class Person implements EnergyState {
    EnergyState energyState;

    public Person(EnergyState energyState) {
        this.energyState = energyState;
    }

    public void setEnergyState(EnergyState energyState) {
        this.energyState = energyState;
    }

    @Override
    public String walk() {
        return energyState.walk();
    }

    @Override
    public String rest() {
        return energyState.rest();
    }
}

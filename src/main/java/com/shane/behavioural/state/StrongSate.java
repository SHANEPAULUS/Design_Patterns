package com.shane.behavioural.state;

/**
 * Created by SHANE on 2015/03/13.
 */
public class StrongSate implements EnergyState {
    @Override
    public String walk() {
        return "I am excited to walk";
    }

    @Override
    public String rest() {
        return "I don't want to rest now";
    }
}

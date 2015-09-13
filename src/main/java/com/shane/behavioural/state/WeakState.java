package com.shane.behavioural.state;

/**
 * Created by SHANE on 2015/03/13.
 */
public class WeakState implements EnergyState {
    @Override
    public String walk() {
        return "Not now, I am too tired to walk";
    }

    @Override
    public String rest() {
        return "Finally, I am excited to rest";
    }
}

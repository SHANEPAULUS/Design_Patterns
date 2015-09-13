package com.shane.behavioural.mediator;

/**
 * Created by SHANE on 2015/09/13.
 */
public class SouthAfricanBuyer extends Buyer{
    public SouthAfricanBuyer(Mediator mediator) {
        super(mediator, "rand");
        this.mediator.registerZaBuyer(this);
    }
}

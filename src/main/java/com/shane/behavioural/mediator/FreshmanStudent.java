package com.shane.behavioural.mediator;

/**
 * Created by SHANE on 2015/03/13.
 */
public class FreshmanStudent extends Student {
    public FreshmanStudent(Mediator mediator) {
        super(mediator);
        this.desc="Freshman";
        this.mediator.registerfreshmanStudent(this);
    }
}

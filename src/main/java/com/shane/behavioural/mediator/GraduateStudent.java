package com.shane.behavioural.mediator;

/**
 * Created by SHANE on 2015/03/13.
 */
public class GraduateStudent extends Student {
    public GraduateStudent(Mediator mediator) {
        super(mediator);
        this.desc="Grad";
        this.mediator.registerGraduateStudent(this);
    }
}

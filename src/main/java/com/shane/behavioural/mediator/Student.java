package com.shane.behavioural.mediator;

/**
 * Created by SHANE on 2015/03/13.
 */
public class Student {
    Mediator mediator;
    String desc;

    public Student(Mediator mediator) {
        this.mediator = mediator;
    }

    public boolean getLesson(int level)
    {
        if(level<5)
            return false;
        else return true;
    }
}

package com.shane.behavioural.mediator;

/**
 * Created by SHANE on 2015/03/13.
 */
public class Lesson {
    Mediator mediator;
    boolean flag=false;

    public Lesson(Mediator mediator) {
        this.mediator = mediator;
        this.mediator.registerClassLesson(this);
    }

    public void teach(Student s)
    {
        if("grad".equalsIgnoreCase(s.desc));
        flag=true;
    }

    public boolean lesson()
    {
        return flag;
    }
}

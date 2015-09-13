package com.shane.behavioural.mediator;

/**
 * Created by SHANE on 2015/03/13.
 */
public class Lecturer {
    Mediator mediator;


    public Lecturer(Mediator mediator) {
        this.mediator = mediator;
        this.mediator.registerLecturerProfessor(this);
    }

    public boolean isClassAccepted(Student s)
    {
        if(s.desc=="Freshman") {
            System.out.println("The professor refuses to teach freshman students");
            return false;
        }else
            System.out.println("The Professor Accepted to teach graduate students.");
            return true;
    }
}

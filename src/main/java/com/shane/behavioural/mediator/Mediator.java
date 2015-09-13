package com.shane.behavioural.mediator;

/**
 * Created by SHANE on 2015/03/13.
 */
public class Mediator {

    Student freshman;
    Student graduate;

    Lecturer professor;
    Lesson classLesson;

    public void registerfreshmanStudent(FreshmanStudent freshmanStudent)
    {
        this.freshman=freshmanStudent;
    }

    public void registerGraduateStudent(GraduateStudent graduatestudent)
    {
        this.graduate=graduatestudent;
    }

    public void registerClassLesson(Lesson classLesson)
    {
        this.classLesson=classLesson;
    }

    public void registerLecturerProfessor(Lecturer professor)
    {
        this.professor=professor;
    }

    public boolean teach(Student stud)
    {
        classLesson.teach(stud);
        return classLesson.lesson();
    }
}

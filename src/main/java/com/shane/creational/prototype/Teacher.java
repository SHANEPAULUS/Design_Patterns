package com.shane.creational.prototype;

/**
 * Created by SHANE on 2015/03/11.
 */
public class Teacher implements CloneObject {
    private String name;

    public Teacher(String value)
    {
        this.name=value;
    }
    @Override
    public CloneObject copy() {
        return new Teacher(name);
    }

    public String getName() {
        return name;
    }
}

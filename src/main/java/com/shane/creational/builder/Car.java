package com.shane.creational.builder;

/**
 * Created by SHANE on 2015/03/11.
 */
public class Car {
    private String make;
    private int year;
    private double engineSize;

    public String getMake()
    {
        return make;
    }

    public int getYear()
    {
        return year;
    }

    public double getEngineSize()
    {
        return engineSize;
    }

    public void setMake(String m)
    {
        this.make=m;
    }

    public void setYear(int y)
    {
        this.year=y;
    }

    public void setEngineSize(double eS)
    {
        engineSize=eS;
    }

    @Override
    public String toString()
    {
        return "Car{ buildMake='"+make+'\''+
                ",buildEngine='"+engineSize+'\''+
                ",buildYear='"+year+'\''+
                '}';
    }
}

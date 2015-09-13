package com.shane.behavioural.strategy;

/**
 * Created by SHANE on 2015/03/13.
 */
public class Context {
    int year;
    Strategy strategy;

    public Context(int year, Strategy strategy) {
        this.year = year;
        this.strategy = strategy;
    }

    public void setStrategy(Strategy s)
    {
        this.strategy=s;
    }

    public int getYear()
    {
        return this.year;
    }

    public boolean getResult()
    {
        return strategy.checkMovie(year);
    }
}

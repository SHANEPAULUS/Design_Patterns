package com.shane.behavioural.visitor;

/**
 * Created by SHANE on 2015/03/13.
 */
public class Toyota implements CarElement {
    int year;
    int engineSize;

    public Toyota(int year, int engineSize) {
        this.year = year;
        this.engineSize = engineSize;
    }

    @Override
    public void accept(CarVistor carvisitor) {
        carvisitor.visit(this);
    }
}

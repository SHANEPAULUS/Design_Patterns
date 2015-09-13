package com.shane.behavioural.visitor;

/**
 * Created by SHANE on 2015/03/13.
 */
public class Toyota extends Car implements CarElement {
    public Toyota(int year, int engineSize) {
        super(year, engineSize);
    }

    @Override
    public void accept(CarVistor carvisitor) {
        carvisitor.visitToy(this);
    }
}

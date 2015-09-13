package com.shane.behavioural.visitor;

/**
 * Created by SHANE on 2015/03/13.
 */
public class BMW extends Car implements CarElement {
    public BMW(int year, int engineSize) {
        super(year, engineSize);
    }

    @Override
    public void accept(CarVistor carvisitor) {
        carvisitor.visitBim(this);
    }
}

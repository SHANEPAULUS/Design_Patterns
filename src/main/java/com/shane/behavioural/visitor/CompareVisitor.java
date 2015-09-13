package com.shane.behavioural.visitor;

import java.util.List;

/**
 * Created by SHANE on 2015/03/13.
 */
public class CompareVisitor implements CarVistor {
    CarVistor carVistor;

    @Override
    public void visit(BMW bmw) {
        bmw.accept(carVistor);
    }

    @Override
    public void visit(Toyota toy) {
        toy.accept(carVistor);
    }

    @Override
    public void visit(List<CarElement> list) {
        for(CarElement ca: list)
        {
            ca.accept(this);
        }
    }

    public String compare(BMW b,Toyota t)
    {
        if(b.year>t.year)
            return "BMW is newer than Toyota";
        else return "Toyota is newer than BMW";
    }
}

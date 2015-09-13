package com.shane.behavioural.visitor;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SHANE on 2015/09/13.
 */
public class TestVisitor {
    BMW car1;
    Toyota car2;
    List<CarElement> list;
    CarVistor carVistor;

    @Test
    public void testVisitor() throws Exception {
        carVistor=new CompareVisitor();

        list=new ArrayList<CarElement>();
        car1=new BMW(2015,2979);
        car2=new Toyota(2012,1989);

        car1.accept(carVistor);
        car2.accept(carVistor);

        list.add(car1);
        list.add(car2);

        carVistor.visit(list);
    }
}

package com.shane.behavioural.visitor;

import java.util.List;

/**
 * Created by SHANE on 2015/03/13.
 */
public interface CarVistor {
    public void visit(BMW bmw);
    public void visit(Toyota toy);
    public void visit(List<CarElement> list);
}

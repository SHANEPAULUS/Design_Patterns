package com.shane.behavioural.visitor;

import java.util.List;

/**
 * Created by SHANE on 2015/03/13.
 */
public interface CarVistor {
    public void visitBim(BMW bmw);
    public void visitToy(Toyota toy);
    public void visit(List<BMW> bmwList);
}

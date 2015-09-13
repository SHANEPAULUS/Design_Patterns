package com.shane.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SHANE on 2015/09/09.
 */
public class Composite implements Engine{

    List<Engine> engineList=new ArrayList<Engine>();

    @Override
    public void go() {
        for(Engine engine:engineList)
        {
            engine.go();
        }

    }

    @Override
    public void off() {
        for(Engine engine:engineList)
        {
            engine.off();
        }
    }

    public void add(Engine engine)
    {
        engineList.add(engine);
    }

    public void remove(Engine engine)
    {
        engineList.remove(engine);
    }

    public List<Engine> getEngines()
    {
        return engineList;
    }

    public Engine getEngine(int index)
    {
        return engineList.get(index);
    }
}

package com.shane.structural.bridge;

/**
 * Created by SHANE on 2015/03/13.
 */
public class NormalEngine implements Engine {
    int hp;
    public NormalEngine()
    {
        hp=120;
    }
    @Override
    public int go() {
        return hp;
    }
}

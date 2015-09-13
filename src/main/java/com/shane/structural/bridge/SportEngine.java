package com.shane.structural.bridge;

/**
 * Created by SHANE on 2015/03/13.
 */
public class SportEngine implements Engine {
    int hp;
    public SportEngine()
    {
        hp=320;
    }

    @Override
    public int go() {
        return hp;
    }
}

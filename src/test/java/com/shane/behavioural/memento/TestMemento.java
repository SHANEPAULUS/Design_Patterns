package com.shane.behavioural.memento;

import org.junit.Test;

/**
 * Created by SHANE on 2015/09/13.
 */
public class TestMemento {
    JogInfoCaretaker jogInfoCaretaker;
    JogInfo jogInfo;

    @Test
    public void testMemento() throws Exception {
        jogInfoCaretaker=new JogInfoCaretaker();
        jogInfo=new JogInfo("Shane",1,12);

        System.out.println(jogInfo);

        jogInfo.setDayNumberAndDistance(2,13);
        System.out.println(jogInfo);
        //Saving state
        jogInfoCaretaker.saveState(jogInfo);

        jogInfo.setDayNumberAndDistance(3,15);
        System.out.println(jogInfo);

        //Restoring state
        jogInfoCaretaker.restore(jogInfo);
        System.out.println(jogInfo);
    }
}

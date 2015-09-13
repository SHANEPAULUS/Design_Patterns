package com.shane.behavioural.chainofresponsibility;

import org.junit.Test;

/**
 * Created by SHANE on 2015/09/10.
 */
public class TestChainOfResponsibility {
    BmwHandler chain;

    @Test
    public void testChain() throws Exception {
        chain = setupChain();

        chain.handle(BmwEnum.F30);
        chain.handle(BmwEnum.F10);
        chain.handle(BmwEnum.F80);
        chain.handle(BmwEnum.F20);
    }

    public static BmwHandler setupChain()
    {
        BmwHandler ch1=new ThreeSeriesHandler();
        BmwHandler ch2=new FiveSeriesHandler();
        BmwHandler ch3=new OneSeriesHandler();

        ch1.setSuccessor(ch2);
        ch2.setSuccessor(ch3);

        return ch1;
    }
}

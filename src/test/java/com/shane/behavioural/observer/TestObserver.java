package com.shane.behavioural.observer;

import org.junit.Test;

/**
 * Created by SHANE on 2015/09/13.
 */
public class TestObserver {
    MovieTheater theater;
    MovieCustomer1 cust1;
    MovieCustomer2 cust2;

    @Test
    public void testTheater() throws Exception {
        theater=new MovieTheater("Minimax");
        cust1=new MovieCustomer1();
        cust2=new MovieCustomer2();

        theater.addObserver(cust1);
        theater.addObserver(cust2);

        theater.setTitle("The Incredible Programmer..");
        theater.removeObserver(cust1);
        theater.setTitle("Mr and Mrs Smith");
    }
}

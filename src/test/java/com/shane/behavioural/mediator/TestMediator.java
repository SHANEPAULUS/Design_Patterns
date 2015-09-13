package com.shane.behavioural.mediator;

import org.junit.Test;

/**
 * Created by SHANE on 2015/09/13.
 */
public class TestMediator {

    Mediator mediator;
    Buyer b1;
    double sellingPrice=20D;
    AmericanSeller seller;
    DollarConverter converter;

    double southAfricanRand=180D;

    @Test
    public void testMediator() throws Exception {
        mediator=new Mediator();
        b1=new SouthAfricanBuyer(mediator);
        seller=new AmericanSeller(mediator,sellingPrice);

        converter=new DollarConverter(mediator);

        while(!b1.attemptPurchase(southAfricanRand))
        {
            southAfricanRand+=30D;
        }
    }
}

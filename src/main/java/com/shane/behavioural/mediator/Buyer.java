package com.shane.behavioural.mediator;

/**
 * Created by SHANE on 2015/09/13.
 */
public class Buyer {
    Mediator mediator;
    String unitOfCurrency;

    public Buyer(Mediator mediator, String unitOfCurrency) {
        this.mediator = mediator;
        this.unitOfCurrency = unitOfCurrency;
    }

    public Boolean attemptPurchase(double bid)
    {
        System.out.println("Buyer placing bid of "+bid+" "+unitOfCurrency);
        return mediator.placeBid(bid,unitOfCurrency);
    }
}

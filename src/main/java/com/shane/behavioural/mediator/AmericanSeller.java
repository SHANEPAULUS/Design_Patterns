package com.shane.behavioural.mediator;

/**
 * Created by SHANE on 2015/09/13.
 */
public class AmericanSeller {
    Mediator mediator;
    double priceInDollars;

    public AmericanSeller(Mediator mediator, double priceInDollars) {
        this.mediator = mediator;
        this.priceInDollars = priceInDollars;
        this.mediator.registerAmericanSeller(this);
    }

    public Boolean isBidAccepted(double bidInDollars)
    {
        if(bidInDollars>=priceInDollars)
        {
            System.out.println("Seller accepts bid of "+bidInDollars+" dollars\n");
            return true;
        }

        else
        {
            System.out.println("Seller rejects bid of "+bidInDollars+" dollars\n");
            return false;
        }
    }
}

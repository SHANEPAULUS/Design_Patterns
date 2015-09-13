package com.shane.behavioural.mediator;

/**
 * Created by SHANE on 2015/09/13.
 */
public class Mediator {

    Buyer zaBuyer;
    Buyer usBuyer;
    AmericanSeller americanSeller;
    DollarConverter converter;

    public Mediator() {
    }

    public void registerZaBuyer(SouthAfricanBuyer southAfricanBuyer){this.zaBuyer=southAfricanBuyer;}
    //public void registerUsBuyer(){}

    public void registerAmericanSeller(AmericanSeller usSeller){this.americanSeller=usSeller;}

    public void registerDollarConverter(DollarConverter dollarConverter){this.converter=dollarConverter;}

    public boolean placeBid(double bid,String unitOfCurrency)
    {
        double dollars=converter.convertCurrencyToDollars(bid,unitOfCurrency);
        return americanSeller.isBidAccepted(dollars);
    }

}

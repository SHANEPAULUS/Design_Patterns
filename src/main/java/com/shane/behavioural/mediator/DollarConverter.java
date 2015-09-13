package com.shane.behavioural.mediator;

/**
 * Created by SHANE on 2015/09/13.
 */
public class DollarConverter {

    Mediator mediator;

    public static final double DOLLAR_UNIT=1.0D;
    public static final double ZA_UNIT=12.9D;

    public DollarConverter(Mediator mediator) {
        this.mediator = mediator;
        mediator.registerDollarConverter(this);
    }

    public double convertRandToDollars(double rand)
    {
        double dollars=rand*(DOLLAR_UNIT/ZA_UNIT);
        System.out.println("Converting "+rand+" rand to "+dollars+" dollars");
        return  dollars;
    }

    public double convertCurrencyToDollars(double amt,String unitOfCurrency)
    {
        //if("rand".equalsIgnoreCase(unitOfCurrency))
            return convertRandToDollars(amt);
    }
}

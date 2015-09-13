package com.shane.behavioural.chainofresponsibility;

/**
 * Created by SHANE on 2015/03/13.
 */
public abstract class BmwHandler {
    BmwHandler successor;

    public void setSuccessor(BmwHandler successor)
    {
        this.successor=successor;
    }

    public abstract String handle(BmwEnum request);
}

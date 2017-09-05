package com.shane.behavioural.chainofresponsibility;

/**
 * Created by SHANE on 2015/03/13.
 */

public abstract class BmwHandler {
   
   private BmwHandler successor;
   
   
   public void setSuccessor(final BmwHandler successor){
      this.successor = successor;
   }
   
   
   public abstract String handle(final BmwEnum request);
}
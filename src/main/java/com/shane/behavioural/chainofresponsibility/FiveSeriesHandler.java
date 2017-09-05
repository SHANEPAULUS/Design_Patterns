package com.shane.behavioural.chainofresponsibility;

/**
 * Created by SHANE on 2015/09/10.
 */

public class FiveSeriesHandler extends BmwHandler {
   
   @Override   public String handle(final BmwEnum request){
      if(request == BmwEnum.F10){
         System.out.println("Five series handles " + request);
         return "Five series handles " + request;
      }else{
         System.out.println("Five series doesn't handle " + request);
         //if(successor!=null)
         return successor.handle(request);
      }
   }
}
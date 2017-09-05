package com.shane.behavioural.chainofresponsibility;

/**
 * Created by SHANE on 2015/09/10.
 */
public class OneSeriesHandler extends BmwHandler {
   
   @Override   public String handle(final BmwEnum request){
      if(request == BmwEnum.F20){
         System.out.println("One series handles " + request);
         return "One series handles " + request;
      }else{
         System.out.println("One series doesn't handle " + request);
         //if(successor!=null)
         return successor.handle(request);
      }
   }
}

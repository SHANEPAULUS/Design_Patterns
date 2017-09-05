package com.shane.behavioural.chainofresponsibility;

/**
 * Created by SHANE on 2015/09/10.
 */
public class ThreeSeriesHandler extends BmwHandler {
   
   @Override   public String handle(BmwEnum request){
      if(request == BmwEnum.F30 || request == BmwEnum.F80){
         System.out.println("Three series handles " + request);
         return "Three series handles " + request;
      }else{
         System.out.println("Three series doesn't handle " + request);
         //if(successor!=null)
         return successor.handle(request);
      }
   }
}

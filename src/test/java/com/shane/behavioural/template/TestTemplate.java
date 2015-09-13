package com.shane.behavioural.template;

import org.junit.Test;

/**
 * Created by SHANE on 2015/09/13.
 */
public class TestTemplate {
    Meal meal1;
    Meal meal2;

    @Test
    public void testTemplate() throws Exception {
        meal1=new Braai();
        meal1.doMeal();

        System.out.println();

        meal2=new PieMeal();
        meal2.doMeal();
    }
}

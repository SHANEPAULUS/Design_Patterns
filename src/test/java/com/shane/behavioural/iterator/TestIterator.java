package com.shane.behavioural.iterator;

import org.junit.Test;

import java.util.Iterator;

/**
 * Created by SHANE on 2015/09/13.
 */
public class TestIterator {
    Inventory i1;
    Inventory i2;
    Inventory i3;
    Menu menu;
    Iterator<Inventory> iterator;

    @Test
    public void testIterator() throws Exception {
        i1=new Inventory("Sugar",30D);
        i2=new Inventory("Coffee",25D);
        i3=new Inventory("Toothpaste",20D);

        menu=new Menu();
        menu.addItem(i1);
        menu.addItem(i2);
        menu.addItem(i3);

        System.out.println("Displaying Menu");
        iterator=menu.iterator();
        while(iterator.hasNext())
        {
            Inventory i=iterator.next();
            System.out.println(i);
        }

        System.out.println("\nRemoving the last item");
        iterator.remove();

        System.out.println("Displaying Menu");
        iterator=menu.iterator();
        while(iterator.hasNext())
        {
            Inventory i=iterator.next();
            System.out.println(i);
        }

    }
}

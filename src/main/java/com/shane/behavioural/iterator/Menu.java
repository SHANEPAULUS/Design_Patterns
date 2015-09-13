package com.shane.behavioural.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by SHANE on 2015/09/13.
 */
public class Menu {
    List<Inventory> list;

    public Menu() {
        list=new ArrayList<Inventory>();
    }

    public void addItem(Inventory inventory)
    {
        list.add(inventory);
    }

    public Iterator<Inventory> iterator()
    {
        return new MenuIterator();
    }

    class MenuIterator implements Iterator<Inventory> {
        int currentIndex=0;

        @Override
        public boolean hasNext() {
            if(currentIndex>=list.size())
            {
                return false;
            }
            else
            {
                return true;
            }
        }

        @Override
        public Inventory next() {
            return list.get(currentIndex++);
        }

        @Override
        public void remove() {
            list.remove(--currentIndex);
        }
    }
}

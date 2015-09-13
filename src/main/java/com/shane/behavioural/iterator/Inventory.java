package com.shane.behavioural.iterator;

/**
 * Created by SHANE on 2015/09/13.
 */
public class Inventory {

    String name;
    double price;

    public Inventory(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

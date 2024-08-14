package com.booleanuk.core;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class Basket {
    ArrayList<String> basket;
    int basketSize;

    public Basket() {
        this.basket = new ArrayList<>();
        this.basketSize = 4;
    }

    public boolean add(String bagel) {
        basket.add(bagel);
        return basket.contains(bagel);
    }

    public boolean remove(String bagel) {
        if(basket.contains(bagel)) {
            basket.remove(bagel);
            return true;
        }
        return false;
    }
}

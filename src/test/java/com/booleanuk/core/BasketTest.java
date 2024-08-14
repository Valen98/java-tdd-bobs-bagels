package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {

    @Test
    public void addBagelTest() {
        Basket basket = new Basket();

        Assertions.assertTrue(basket.add("Sesame"));
    }

    @Test
    public void removeBagelTest() {
        Basket basket = new Basket();
        basket.add("Plain");
        Assertions.assertTrue(basket.remove("Plain"));

    }

    @Test
    public void checkBasketSize() {
        Basket basket = new Basket();
        Assertions.assertTrue(basket.checkBasketSize());
    }

    @Test
    public  void addBagelToFullBasket() {
        Basket basket = new Basket();
        basket.add("Plain");
        basket.add("Sesame");
        basket.add("Mixed");
        basket.add("Everything bagel");
        basket.add("Plain");
        Assertions.assertTrue(basket.checkBasketSize());
    }

}

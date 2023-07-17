package com.improve10x.discount;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiscountTest {

    private Discount discount;

    @Before
    public void setup() {
        discount = new Discount();
    }

    @Test
    public void nothing(){
    }

    //discount(0, 0) -> 0
    @Test
    public void givenDiscountZero_returnDiscountZero() {
        int totalDiscount = discount.findDiscount(0, 0);
        assertEquals(0, totalDiscount);
    }

    //discount(1500, 50) -> 750
    @Test
    public void givenPriceAndDiscount_returnTotalDiscount() {
        int totalDiscount = discount.findDiscount(1500, 50);
        assertEquals(750, totalDiscount);
    }

    //discount(89, 20) -> 72
    @Test
    public void givenPriceDiscount_returnTotalDiscount() {
        int totalDiscount = discount.findDiscount(89, 20);
        assertEquals(72, totalDiscount);
    }

    //discount(100, 75) -> 25
    @Test
    public void givenPriceDiscountValues_returnTotalDiscount() {
        int totalDiscount = discount.findDiscount(100, 75);
        assertEquals(25, totalDiscount);
    }

    //discount(1000, 75) -> 250
    @Test
    public void givenPriceDiscountValue_returnTotalDiscount() {
        int totalDiscount = discount.findDiscount(1000, 75);
        assertEquals(250, totalDiscount);
    }
}

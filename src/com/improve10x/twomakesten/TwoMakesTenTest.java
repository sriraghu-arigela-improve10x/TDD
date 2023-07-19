package com.improve10x.twomakesten;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TwoMakesTenTest {

    private  TwoMakesTen twoMakesTen;

    @Before
    public void setup(){
        twoMakesTen = new TwoMakesTen();
    }

    @Test
    public void nothing() {

    }
    //input (-6, -2) , output (10) - false
    //input (0, 0) , output (10) - false

    @Test
    public void givenNegativeNumber_returnsFalse() {
        boolean negativeNum = twoMakesTen.getTwoMakesTen(-6, -2);
        assertEquals(false, negativeNum);
    }

    @Test
    public void givenZeros_returnFalse() {
        boolean emptyNum = twoMakesTen.getTwoMakesTen(0, 0);
        assertEquals(false, emptyNum);
    }

    @Test
    public void givenEightAndThree_returnFalse() {
        boolean emptyNum = twoMakesTen.getTwoMakesTen(8, 3);
        assertEquals(false, emptyNum);
    }

    @Test
    public void givenFourAndSix_returnSTrue() {
        boolean fourAndSix = twoMakesTen.getTwoMakesTen(4, 6);
        assertEquals(true, fourAndSix);
    }

    @Test
    public void givenFiveAndFive_returnSTrue() {
        boolean fourAndSix = twoMakesTen.getTwoMakesTen(5, 5);
        assertEquals(true, fourAndSix);
    }

    @Test
    public void givenSevenAndTwo_returnSTrue() {
        boolean fourAndSix = twoMakesTen.getTwoMakesTen(7, 2);
        assertEquals(false, fourAndSix);
    }

    @Test
    public void givenThreeAndSeven_returnSTrue() {
        boolean fourAndSix = twoMakesTen.getTwoMakesTen(3, 7);
        assertEquals(true, fourAndSix);
    }
}

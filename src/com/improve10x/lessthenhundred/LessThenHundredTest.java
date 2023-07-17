package com.improve10x.lessthenhundred;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LessThenHundredTest {

    private LessThenHundred lessThenHundred;

    @Before
    public void setup() {
        lessThenHundred = new LessThenHundred();
    }

    @Test
    public void nothing(){}

    // lessThan100  (0, 0)    =  false
    @Test
    public void GivenZeros_returnZero() {
        boolean belowHundred = lessThenHundred.isLessThenHundred(0, 0);
        assertEquals(false,belowHundred);
    }

    // lessThan100  (22, 15)  =  true
    @Test
    public void GivenTwentyTwoAndFifteenNumbers_returnsTrue() {
        boolean belowHundred = lessThenHundred.isLessThenHundred(22, 15);
        assertEquals(true, belowHundred);
    }

    // lessThan100 (83, 34)   =  false
    @Test
    public void GivenEightyThreeAndThirtyFourNumbers_returnsFalse() {
        boolean belowHundred = lessThenHundred.isLessThenHundred(83, 34);
        assertEquals(false, belowHundred);
    }

    // lessThan100 (15, 87)   =  false
    @Test
    public void GivenFifteenAndEightySevenNumbers_returnsFalse() {
        boolean belowHundred = lessThenHundred.isLessThenHundred(15, 87);
        assertEquals(false, belowHundred);
    }

    // lessThan100 (3, 77)    =  true
    @Test
    public void GivenThreeAndSeventySevenNumbers_returnsFalse() {
        boolean belowHundred = lessThenHundred.isLessThenHundred(3, 77);
        assertEquals(true, belowHundred);
    }

    // lessThan100 (32, 67)    =  true
    @Test
    public void GivenThirtyTwoAndSixtySevenNumbers_returnsFalse() {
        boolean belowHundred = lessThenHundred.isLessThenHundred(32, 67);
        assertEquals(true, belowHundred);
    }
}

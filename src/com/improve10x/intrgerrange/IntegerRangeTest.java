package com.improve10x.intrgerrange;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegerRangeTest {

    private IntegerRange integerRange;

    @Before
    public void setup() {
        integerRange = new IntegerRange();
    }

    @Test
    public void nothing() {
    }

    @Test
    public void givenZero_returnTrue() {
        boolean oneAndThreeAndNine = integerRange.findRange(0, 0, 0);
        assertEquals(false, oneAndThreeAndNine);
    }

    @Test
    public void givenOneAndThreeAndNine_returnTrue() {
        boolean oneAndThreeAndNine = integerRange.findRange(1, 3, 9);
        assertEquals(false, oneAndThreeAndNine);
    }

    @Test
    public void givenSixAndOneAndSix_returnFalse() {
        boolean sixAndOneAndSix = integerRange.findRange(6, 1, 6);
        assertEquals(false, sixAndOneAndSix);
    }

    @Test
    public void givenThreeAndThreeAndEight_returnTrue() {
        boolean threeAndThreeAndEight = integerRange.findRange(3, 3, 8);
        assertEquals(true, threeAndThreeAndEight);
    }

    @Test
    public void givenOneZeroAndEight_returnTrue() {
        boolean threeAndThreeAndEight = integerRange.findRange(1, 0, 8);
        assertEquals(true, threeAndThreeAndEight);
    }
}

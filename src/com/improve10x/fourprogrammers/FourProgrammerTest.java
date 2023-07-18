package com.improve10x.fourprogrammers;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FourProgrammerTest {

    private FourProgrammers programmers;

    @Before
    public void setup() {
        programmers = new FourProgrammers();
    }

    @Test
    public void nothing() {}

    @Test
    public void givenNegativeNumberTen_returnNegativeOne() {
        int returnZero = programmers.differenceMaxMin(-10, -10, -10, -10);
        assertEquals(-1, returnZero);
    }

    @Test
    public void givenNegativeNumberOne_returnSame() {
        int returnZero = programmers.differenceMaxMin(-1, -1, -1, -1);
        assertEquals(-1, returnZero);
    }

    @Test
    public void givenZeros_returnOne() {
        int returnZero = programmers.differenceMaxMin(0, 0, 0, 0);
        assertEquals(1, returnZero);
    }

    @Test
    public void givenFourValues_returnMaxMinDiff() {
        int maxMinValues = programmers.differenceMaxMin(100, 200, 300, 400);
        assertEquals(300, maxMinValues);
    }

    @Test
    public void givenFourNumbers_returnMaxMinDiff() {
        int maxMinValues = programmers.differenceMaxMin(1000, 2000, 3000, 1000);
        assertEquals(2000, maxMinValues);
    }

    @Test
    public void givenNumbers_returnMaxMinDiff() {
        int maxMinValues = programmers.differenceMaxMin(1, 2, 3, 4);
        assertEquals(3, maxMinValues);
    }
}

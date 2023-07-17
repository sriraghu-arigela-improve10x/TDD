package com.improve10x.fourprogrammers;

import org.junit.Assert;
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
    public void givenZeroValues_returnZero() {
        int maxMinValues = programmers.findMaxMin(0, 0, 0, 0);
        assertEquals(-1, maxMinValues);
    }

    @Test
    public void givenFourValues_returnMaxMinDiff() {
        int maxMinValues = programmers.findMaxMin(100, 200, 300, 400);
        assertEquals(300, maxMinValues);
    }

    @Test
    public void givenFourNumbers_returnMaxMinDiff() {
        int maxMinValues = programmers.findMaxMin(1000, 2000, 3000, 1000);
        assertEquals(2000, maxMinValues);
    }

    @Test
    public void givenNumbers_returnMaxMinDiff() {
        int maxMinValues = programmers.findMaxMin(1, 2, 3, 4);
        assertEquals(3, maxMinValues);
    }
}

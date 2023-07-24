package com.improve10x.threeprogrammers;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThreeProgrammersTest {

    private ThreeProgrammers programmers;

    @Before
    public void setup() {
        programmers = new ThreeProgrammers();
    }

    @Test
    public void nothing() {
    }

    @Test
    public void givenNegativeNumberTen_returnNegativeOne() {
        int returnZero = programmers.differenceMaxMin(-10, -10, -10);
        assertEquals(-1, returnZero);
    }

    @Test
    public void givenNegativeNumberOne_returnSame() {
        int returnZero = programmers.differenceMaxMin(-1, -1, -1);
        assertEquals(-1, returnZero);
    }

    @Test
    public void givenZeros_returnOne() {
        int returnZero = programmers.differenceMaxMin(0, 0, 0);
        assertEquals(1, returnZero);
    }

    @Test
    public void givenThreeOnes_returnOne() {
        int returnZero = programmers.differenceMaxMin(1, 1, 1);
        assertEquals(0, returnZero);
    }

    @Test
    public void givenInputThreeValues_returnMaxAndMinValue() {
        int returnOne = programmers.differenceMaxMin(1, 2, 1);
        assertEquals(1, returnOne);
    }

    @Test
    public void givenThreeNegativeValues_returnMaxAndMinValue() {
        int maxMinValues = programmers.differenceMaxMin(-100, -200, -300);
        assertEquals(-1, maxMinValues);
    }

    @Test
    public void givenThreeValues_returnsMaxMinValue() {
        int maxMinValues = programmers.differenceMaxMin(45, 25, 70);
        assertEquals(45, maxMinValues);
    }

    @Test
    public void givenThreeValues_returnDiffMaxAndMinValue() {
        int maxMinValues = programmers.differenceMaxMin(115, 230, 70);
        assertEquals(160, maxMinValues);
    }

    @Test
    public void givenThreeValues_returnMaxMinValue() {
        int maxMinValues = programmers.differenceMaxMin(100, 200, 300);
        assertEquals(200, maxMinValues);
    }

    @Test
    public void givenThreeValues_returnMaxAndMinValue() {
        int returnThousand = programmers.differenceMaxMin(1500, 500, 1000);
        assertEquals(1000, returnThousand);
    }
}


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
    public void givenZeros_returnZeros() {
        int returnZero = programmers.threeProgrammers(0, 0, 0);
        assertEquals(-1, returnZero);
    }

    @Test
    public void givenThreeValues_returnMaxAndMinValue() {
        int returnThousand = programmers.threeProgrammers(1500, 500, 1000);
        assertEquals(1000, returnThousand);
    }

    @Test
    public void givenInputThreeValues_returnMaxAndMinValue() {
        int returnOne = programmers.threeProgrammers(1, 2, 1);
        assertEquals(1, returnOne);
    }
}

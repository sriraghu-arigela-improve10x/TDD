package com.improve10x.threeprogrammers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThreeProgrammersTest {

    @Test
    void nothing() {
    }

    @Test
    public void givenZeros_returnZeros() {
        ThreeProgrammers programmers = new ThreeProgrammers();
        int returnZero = programmers.threeProgrammers(0, 0, 0);
        assertEquals(-1, returnZero);
    }

    @Test
    public void threeProgrammers() {
        ThreeProgrammers programmers = new ThreeProgrammers();
        int returnThousand = programmers.threeProgrammers(1500, 500, 1000);
        assertEquals(1000, returnThousand);
    }

    @Test
    public void threeProgrammersTest() {
        ThreeProgrammers programmers = new ThreeProgrammers();
        int returnOne = programmers.threeProgrammers(1, 2, 1);
        assertEquals(1, returnOne);
    }
}

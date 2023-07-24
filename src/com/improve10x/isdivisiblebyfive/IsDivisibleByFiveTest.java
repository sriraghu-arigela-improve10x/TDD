package com.improve10x.isdivisiblebyfive;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IsDivisibleByFiveTest {

    private IsDivisible isDivisible;

    @Before
    public void setup() {
        isDivisible = new IsDivisible();
    }

    @Test
    public void nothing() {}

    //divisibleByFive (0) = false
    @Test
    public void givenIsDivisibleZero_returnFalse() {
        boolean divisible = isDivisible.isDivisibleByFive(0);
        assertEquals(true, divisible);
    }

    @Test
    public void givenDivisibleMinusOne_returnFalse() {
        boolean divisible = isDivisible.isDivisibleByFive(-1);
        assertEquals(false, divisible);
    }

   // divisibleByFive (5) = true
    @Test
    public void givenIsDivisibleFiftyFive_returnTrue() {
        boolean divisible = isDivisible.isDivisibleByFive(55);
        assertEquals(true, divisible);
    }

    // divisibleByFive (37) = false
    @Test
    public void givenIsDivisibleFive_returnTrue() {
        boolean divisible = isDivisible.isDivisibleByFive(37);
        assertEquals(false, divisible);
    }

    @Test
    public void givenDivisibleFive_returnTrue() {
        boolean divisible = isDivisible.isDivisibleByFive(5);
        assertEquals(true, divisible);
    }

    // divisibleByFive (57) = false
    @Test
    public void givenIsDivisibleFiftySeven_returnTrue() {
        boolean divisible = isDivisible.isDivisibleByFive(57);
        assertEquals(false, divisible);
    }

    // divisibleByFive (25) = false
    @Test
    public void givenIsDivisibleTwentyFive_returnTrue() {
        boolean divisible = isDivisible.isDivisibleByFive(25);
        assertEquals(true, divisible);
    }
 }

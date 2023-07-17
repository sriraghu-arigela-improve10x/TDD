package com.improve10x.isdivisiblebyfive;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

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
        Assert.assertEquals(false, divisible);
    }

   // divisibleByFive (5) = true
    @Test
    public void givenIsDivisibleFiftyFive_returnTrue() {
        boolean divisible = isDivisible.isDivisibleByFive(55);
        Assert.assertEquals(true, divisible);
    }

    // divisibleByFive (37) = false
    @Test
    public void givenIsDivisibleFive_returnTrue() {
        boolean divisible = isDivisible.isDivisibleByFive(37);
        Assert.assertEquals(false, divisible);
    }

    // divisibleByFive (57) = false
    @Test
    public void givenIsDivisibleFiftySeven_returnTrue() {
        boolean divisible = isDivisible.isDivisibleByFive(57);
        Assert.assertEquals(false, divisible);
    }

    // divisibleByFive (25) = false
    @Test
    public void givenIsDivisibleTwentyFive_returnTrue() {
        boolean divisible = isDivisible.isDivisibleByFive(25);
        Assert.assertEquals(true, divisible);
    }
 }

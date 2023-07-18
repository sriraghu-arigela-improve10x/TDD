package com.improve10x.factorial;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FactorialNumberTest {

    private FactorialNumber factorialNumber;

    @Before
    public void setup() {
        factorialNumber = new FactorialNumber();
    }

    @Test
    public void nothing() {

    }

    //input -10 - output = -10
    @Test
    public void givenNegativeNumber_returnNegativeNumber() {
        long factoNum = factorialNumber.findFactorialNumber(-10);
        assertEquals(-1, factoNum);
    }

    //input -1 - output = -1
    @Test
    public void givenNegativeNumberOne_returnNegativeNumber() {
        long factoNum = factorialNumber.findFactorialNumber(-1);
        assertEquals(-1, factoNum);
    }

    @Test
    public void givenZero_returnOne() {
        long factoNum = factorialNumber.findFactorialNumber(0);
        assertEquals(1, factoNum);
    }

    //input 4 - output = 24
    @Test
    public void givenFour_returnsFactorialNum(){
        long factoNum = factorialNumber.findFactorialNumber(4);
        assertEquals(24, factoNum);
    }

    //input 5 - output = 120
    @Test
    public void givenFive_returnsFactorialNum(){
        long factoNum = factorialNumber.findFactorialNumber(5);
        assertEquals(120, factoNum);
    }

    //input 6 - output = 720
    @Test
    public void givenSix_returnsFactorialNum(){
        long factoNum = factorialNumber.findFactorialNumber(6);
        assertEquals(720, factoNum);
    }
}

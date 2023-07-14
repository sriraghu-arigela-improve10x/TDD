package com.improve10x.factorial;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FactorialNumberTest {

    @Test
    public void nothing() {

    }

    @Test
    public void givenFour_returnsFactorialNum(){
        FactorialNumber factorialNumber = new FactorialNumber();
        long factoNum = factorialNumber.findFactorialNumber(4);
        assertEquals(24, factoNum);
    }

    @Test
    public void givenFive_returnsFactorialNum(){
        FactorialNumber factorialNumber = new FactorialNumber();
        long factoNum = factorialNumber.findFactorialNumber(5);
        assertEquals(120, factoNum);
    }

    @Test
    public void givenSix_returnsFactorialNum(){
        FactorialNumber factorialNumber = new FactorialNumber();
        long factoNum = factorialNumber.findFactorialNumber(6);
        assertEquals(720, factoNum);
    }
}

package com.improve10x.factorial;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FactorialNumberTest {

    @Test
    public void nothing() {

    }


    //input 4 - output = 24
    @Test
    public void givenFour_returnsFactorialNum(){
        FactorialNumber factorialNumber = new FactorialNumber();
        long factoNum = factorialNumber.findFactorialNumber(4);
        assertEquals(24, factoNum);
    }

    //input 5 - output = 120
    @Test
    public void givenFive_returnsFactorialNum(){
        FactorialNumber factorialNumber = new FactorialNumber();
        long factoNum = factorialNumber.findFactorialNumber(5);
        assertEquals(120, factoNum);
    }

    //input 6 - output = 720
    @Test
    public void givenSix_returnsFactorialNum(){
        FactorialNumber factorialNumber = new FactorialNumber();
        long factoNum = factorialNumber.findFactorialNumber(6);
        assertEquals(720, factoNum);
    }
}

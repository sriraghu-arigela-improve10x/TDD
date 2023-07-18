package com.improve10x.FizzBuzz;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    @Test
    public void noting() {
    }

    //input 0 - output -0
    @Test
    public void givenEmpty_returnEmpty() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String empty = fizzBuzz.findFizzBuzz(0);
        assertEquals("0", empty);
    }

    //given input 15 output = FizzBuzz
    @Test
    public void givenIntNumberFifteen_returnsFizzBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String fifteen = fizzBuzz.findFizzBuzz(15);
        assertEquals("FizzBuzz", fifteen);
    }

    //given input 3 output = Fizz
    @Test
    public void givenThreeNumber_returnsFizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String three = fizzBuzz.findFizzBuzz(3);
        assertEquals("Fizz", three);
    }

    ////given input 5 output = buzz
    @Test
    public void givenFiveNumber_returnsBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String five = fizzBuzz.findFizzBuzz(5);
        assertEquals("Buzz", five);
    }

    @Test
    public void givenOne_returnOne() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String one = fizzBuzz.findFizzBuzz(1);
        assertEquals("1", one);
    }
}

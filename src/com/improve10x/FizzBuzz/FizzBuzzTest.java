package com.improve10x.FizzBuzz;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    @Test
    public void noting(){
    }

    @Test
    public void givenEmpty_returnEmpty() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String empty = fizzBuzz.findFizzBuzz(0);
        assertEquals(empty, empty);
    }

    @Test
    public void givenIntNumberThreeFive_returnsFizzBuzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String ThreeFive = fizzBuzz.findFizzBuzz(15);
        assertEquals("FizzBuzz", ThreeFive);
    }

    @Test
    public void givenThreeNumber_returnsFizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String three = fizzBuzz.findFizzBuzz(3);
        assertEquals("Fuzz", three);
    }

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

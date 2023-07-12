package com.improve10x.fibonacci;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciTest {

    @Test
    public void nothing() {
    }

    /*
    0, 1, 1, 2, 3, 5, 8...

    input -10 - expectedOutput -1;
    input 0 - expectedOutput 0;
    input 1 - expectedOutput 1;
    input 2 - expectedOutput 2;
    input 3 - expectedOutput 3;
    input 5 - expectedOutput 5;
     */

    @Test
    public void givenAnyNegativeNumber_returnsNegativeOne(){
        Fibonacci fibonacci = new Fibonacci();
        int negativeFibonacci = fibonacci.find(-10);
        assertEquals(-1, negativeFibonacci);
    }

    @Test
    public void givenZerothFibonacci_returnsZerothFibonacci(){
        Fibonacci fibonacci = new Fibonacci();
        int zerothFibonacci = fibonacci.find(0);
        assertEquals(0, zerothFibonacci);
    }

    @Test
    public void givenFirstFibonacci_returnsFirstFibonacci() {
        Fibonacci fibonacci = new Fibonacci();
        int firstFibonacci = fibonacci.find(1);
        assertEquals(1, firstFibonacci);
    }

    @Test
    public void givenSecondFibonacci_returnsSecondFibonacci() {
        Fibonacci fibonacci = new Fibonacci();
        int secondFibonacci = fibonacci.find(2);
        assertEquals(1, secondFibonacci);
    }

    @Test
    public void givenThirdFibonacci_returnsThirdFibonacci() {
        Fibonacci fibonacci = new Fibonacci();
        int thirdFibonacci = fibonacci.find(2);
        assertEquals(1, thirdFibonacci);
    }

    @Test
    public void givenFourthFibonacci_returnsFourthFibonacci() {
        Fibonacci fibonacci = new Fibonacci();
        int thirdFibonacci = fibonacci.find(3);
        assertEquals(2, thirdFibonacci);
    }

    @Test
    public void givenFifthFibonacci_returnsFifthFibonacci() {
        Fibonacci fibonacci = new Fibonacci();
        int fifthFibonacci = fibonacci.find(5);
        assertEquals(5, fifthFibonacci);
    }
}

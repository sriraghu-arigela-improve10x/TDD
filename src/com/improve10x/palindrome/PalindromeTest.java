package com.improve10x.palindrome;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PalindromeTest {

    private Palindrome palindrome;

    @Before
    public void setup() {
        palindrome = new Palindrome();
    }

    @Test
    public void nothing() {}

    @Test
    public void givenOneTwoOneNumber_returnPalindromeNumber() {
        boolean palindromeNum = palindrome.isPalindromeNumber(121);
        assertEquals(true, palindromeNum);
    }

    @Test
    public void givenOneThousandOneNumber_returnPalindromeNumber() {
        boolean palindromeNum = palindrome.isPalindromeNumber(1001);
        assertEquals(true, palindromeNum);
    }

    @Test
    public void givenOneHundredElevenNumber_returnPalindromeNumber() {
        boolean palindromeNum = palindrome.isPalindromeNumber(111);
        assertEquals(true, palindromeNum);
    }

    @Test
    public void givenOneHundredTwelveNumber_returnPalindromeNumber() {
        boolean palindromeNum = palindrome.isPalindromeNumber(112);
        assertEquals(false, palindromeNum);
    }
}

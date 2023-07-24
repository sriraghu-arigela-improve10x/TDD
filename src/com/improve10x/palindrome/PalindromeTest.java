package com.improve10x.palindrome;

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
    public void givenZero_returnPalindromeZero() {
        boolean palindromeNum = palindrome.isPalindrome(0);
        assertEquals(true, palindromeNum);
    }


    @Test
    public void givenMinusOne_returnPalindromeMinusOne() {
        boolean palindromeNum = palindrome.isPalindrome(-1);
        assertEquals(true, palindromeNum);
    }
    @Test
    public void givenMinusTen_returnPalindromeMinusOne() {
        boolean palindromeNum = palindrome.isPalindrome(-10);
        assertEquals(true, palindromeNum);
    }

    @Test
    public void givenOne_returnPalindromeOne() {
        boolean palindromeNum = palindrome.isPalindrome(1);
        assertEquals(true, palindromeNum);
    }

    @Test
    public void givenEleven_returnPalindromeNumber() {
        boolean palindromeNum = palindrome.isPalindrome(11);
        assertEquals(true, palindromeNum);
    }

    @Test
    public void givenFifteen_returnPalindromeNumber() {
        boolean palindromeNum = palindrome.isPalindrome(15);
        assertEquals(false, palindromeNum);
    }

    @Test
    public void givenOneHundredElevenNumber_returnPalindromeNumber() {
        boolean palindromeNum = palindrome.isPalindrome(111);
        assertEquals(true, palindromeNum);
    }

    @Test
    public void givenOneHundredTwelveNumber_returnPalindromeNumber() {
        boolean palindromeNum = palindrome.isPalindrome(112);
        assertEquals(false, palindromeNum);
    }

    @Test
    public void givenOneTwoOneNumber_returnPalindromeNumber() {
        boolean palindromeNum = palindrome.isPalindrome(121);
        assertEquals(true, palindromeNum);
    }

    @Test
    public void givenOneThousandOneNumber_returnPalindromeNumber() {
        boolean palindromeNum = palindrome.isPalindrome(1001);
        assertEquals(true, palindromeNum);
    }
}

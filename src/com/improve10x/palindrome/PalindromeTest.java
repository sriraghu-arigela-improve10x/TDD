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
    public void givenZer_returnPalindromeZero() {
        boolean palindromeNum = palindrome.isPalindrome(0);
        assertEquals(true, palindromeNum);
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
    public void givenOneHundredTwelve_returnPalindromeNumber() {
        boolean palindromeNum = palindrome.isPalindrome(112);
        assertEquals(false, palindromeNum);
    }
}

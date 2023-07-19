package com.improve10x.strpalindrome;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StrPalindromeTest {

    private StrPalindrome palindrome;

    @Before
    public void setup() {
        palindrome = new StrPalindrome();
    }

    @Test
    public void nothing() {}

    @Test
    public void givenNull_returnFalse() {
        boolean palindromeText = palindrome.isPalindrome(null);
        assertEquals(false, palindromeText);
    }
}

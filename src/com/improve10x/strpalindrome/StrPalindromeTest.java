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

    @Test
    public void givenEmptyString_returnTrue() {
        boolean palindromeText = palindrome.isPalindrome("");
        assertEquals(true, palindromeText);
    }

    @Test
    public void givenACharacter_returnTrue() {
        boolean palindromeText = palindrome.isPalindrome("a");
        assertEquals(true, palindromeText);
    }

    @Test
    public void givenABCharacters_returnFalse() {
        boolean palindromeText = palindrome.isPalindrome("ab");
        assertEquals(false, palindromeText);
    }

    @Test
    public void givenAACharacters_returnTrue() {
        boolean palindromeText = palindrome.isPalindrome("aa");
        assertEquals(true, palindromeText);
    }

    @Test
    public void givenABACharacters_returnTrue() {
        boolean palindromeText = palindrome.isPalindrome("aba");
        assertEquals(true, palindromeText);
    }

    @Test
    public void givenAABCharacters_returnTrue() {
        boolean palindromeText = palindrome.isPalindrome("aab");
        assertEquals(false, palindromeText);
    }

    @Test
    public void givenAAACharacters_returnTrue() {
        boolean palindromeText = palindrome.isPalindrome("aaa");
        assertEquals(true, palindromeText);
    }

    @Test
    public void givenStringTextABAABAABA_returnTrue() {
        boolean palindromeText = palindrome.isPalindrome("abaabaaba");
        assertEquals(true, palindromeText);
    }

    @Test
    public void givenStringTextABCD_returnTrue() {
        boolean palindromeText = palindrome.isPalindrome("abcd");
        assertEquals(false, palindromeText);
    }

    @Test
    public void givenStringTextMadam_returnTrue() {
        boolean palindromeText = palindrome.isPalindrome("madam");
        assertEquals(true, palindromeText);
    }
}

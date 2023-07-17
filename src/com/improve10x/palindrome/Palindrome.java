package com.improve10x.palindrome;

public class Palindrome {
    public boolean isPalindromeNumber(int n) {
        boolean result = false;
        int originalNumber = n;
        int reverseNumber = 0;
        while (n > 0) {
            int remainder = n % 10;
            reverseNumber = reverseNumber * 10 + remainder;
            n = n / 10;
        }
        if (originalNumber == reverseNumber) {
            result = true;
        }
        return result;
    }
}

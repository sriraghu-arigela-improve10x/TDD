package com.improve10x.palindrome;

public class Palindrome {
    public boolean isPalindrome(int n) {
        boolean result = false;
        if (n == 0) {
            result = true;
        } else if (n <= -1) {
            result = true;
        }
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

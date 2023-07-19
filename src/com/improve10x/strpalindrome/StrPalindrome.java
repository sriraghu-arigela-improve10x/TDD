package com.improve10x.strpalindrome;

public class StrPalindrome {
    public boolean isPalindrome(String text) {
        if (text == null) {
            return false;
        } else if(text == "") {
            return true;
        } else if (text.length() == 1) {
            return true;
        } else if (text.length() >= 2) {
            StringBuilder stringBuilder = new StringBuilder(text);
            stringBuilder.reverse();
            String reverse = stringBuilder.toString();
            if (text.equals(reverse)) {
                return true;
            }
        }
        return false;
    }
}

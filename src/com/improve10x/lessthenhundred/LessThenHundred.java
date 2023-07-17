package com.improve10x.lessthenhundred;

public class LessThenHundred {
    public boolean isLessThenHundred(int numOne, int numTwo) {
        boolean result = false;
        int sum = 0;
        sum = numOne + numTwo;
        if (sum < 100) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}

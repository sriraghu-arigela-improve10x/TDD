package com.improve10x.isdivisiblebyfive;

public class IsDivisible {
    public boolean isDivisibleByFive(int num) {
        boolean result = false;
        if(num % 5 == 0) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}

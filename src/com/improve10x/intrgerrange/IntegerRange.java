package com.improve10x.intrgerrange;

public class IntegerRange {
    public boolean findIntegerRange(int n, int a, int b) {
        boolean result = false;
        if (n < 0) {
            result = false;
        }
        if (n >= a && n < b) {
            result = true;
        }
        return result;
    }
}

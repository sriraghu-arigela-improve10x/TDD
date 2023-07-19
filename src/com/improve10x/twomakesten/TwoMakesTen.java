package com.improve10x.twomakesten;

public class TwoMakesTen {
    public boolean getTwoMakesTen(int a, int b) {
        boolean result = false;
        if(a <= 0 || b <= 0) {
            result = false;
        } else if (a == 10 || b == 10) {
            result = true;
        } else if (a + b == 10) {
            result = true;
        }
        return result;
    }
}

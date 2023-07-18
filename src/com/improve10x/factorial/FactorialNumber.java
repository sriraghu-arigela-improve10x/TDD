package com.improve10x.factorial;

public class FactorialNumber {
    public long findFactorialNumber(int num) {
        long facto = 1;
        if(num < 0) {
            return -1;
        } else if (num > 0) {
            for(int i = 1; i <= num; i++) {
                facto = facto * i;
            }
        }
        return facto;
    }
}

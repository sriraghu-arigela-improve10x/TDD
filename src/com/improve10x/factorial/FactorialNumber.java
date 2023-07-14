package com.improve10x.factorial;

public class FactorialNumber {
    public long findFactorialNumber(int num) {
        long facto = 1;
        for(int i = 1; i <= num; i++) {
            facto = facto * i;
        }
        return facto;
    }
}

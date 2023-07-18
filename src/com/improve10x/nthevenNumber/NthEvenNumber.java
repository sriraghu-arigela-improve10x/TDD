package com.improve10x.nthevenNumber;

public class NthEvenNumber {
    public int findEvenNumber(int n) {
        int evenNumber = 0;
        if (n == 0) {
            return 1;
        } else if(n <= 0) {
            return -1;
        } else if (n > 0) {
            evenNumber = 2 * n - 2;
            return evenNumber;
        }
        return evenNumber;
    }
}

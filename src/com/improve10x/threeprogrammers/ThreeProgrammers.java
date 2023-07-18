package com.improve10x.threeprogrammers;

public class ThreeProgrammers {
    public int differenceMaxMin(int paid1, int paid2, int paid3) {
        if(paid1 == 0 || paid2 == 0 || paid3 == 0) {
            return 1;
        } else if (paid1 < 0 || paid2 < 0 || paid3 < 0) {
            return -1;
        } else {
            int difference = 0;
            int maxPaid = 0;
            int minPaid = 0;
            if (paid1 > paid2 && paid1 > paid3) {
                maxPaid = paid1;
            } else if (paid2 > paid3) {
                maxPaid = paid2;
            } else {
                maxPaid = paid3;
            }
            if (paid1 < paid2 && paid1 < paid3) {
                minPaid = paid1;
            } else if (paid2 < paid3) {
                minPaid = paid2;
            } else {
                minPaid = paid3;
            }
            difference = maxPaid - minPaid;
            return difference;
        }
    }
}

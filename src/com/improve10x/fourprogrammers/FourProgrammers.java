package com.improve10x.fourprogrammers;

public class FourProgrammers {
    public int findMaxMin(int paid1, int paid2, int paid3, int paid4) {
        if (paid1 <= 0 || paid2 <= 0 || paid3 <= 0 || paid4 <= 0) {
            return -1;

        } else {
            int difference = 0;
            int maxPaid = 0;
            int minPaid = 0;
            if (paid1 > paid2 && paid1 > paid3 && paid1 > paid4) {
                maxPaid = paid1;
            } else if (paid2 > paid3 && paid2 > paid4) {
                maxPaid = paid2;
            } else if (paid3 > paid4) {
                maxPaid = paid3;
            } else {
                maxPaid = paid4;
            }
            if (paid1 < paid2 && paid1 < paid3 && paid1 < paid4) {
                minPaid = paid1;
            } else if (paid2 < paid3 && paid2 < paid4) {
                minPaid = paid2;
            } else if (paid3 < paid4) {
                minPaid = paid3;
            } else {
                minPaid = paid4;
            }
            difference = maxPaid - minPaid;
            return difference;
        }
    }
}

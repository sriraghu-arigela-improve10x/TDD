package com.improve10x.agetodays;

public class AgeToDays {
    public int convertAgeToDays(int age) {

        if (age == 0) {
            return 1;
        } else if (age < 0) {
            return -1;
        }
        int days = 0;
        days = age * 365;
        return days;
    }
}

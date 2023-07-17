package com.improve10x.phonenumberformat;

public class PhoneNumber {
    public String formatPhoneNumber(int [] number) {
        String phoneNumber = "";
        //formatPhoneNumber([1, 2, 3, 4, 5, 6, 7, 8, 9, 0]) ➞ "(123) 456-7890"
        phoneNumber = ("(" + number[0] + number[1] + number[2] + ")" + " " + number[3] + number[4] + number[5] + "-" + number[6] + number[7] + number[8] + number[9]);
        return phoneNumber;
    }
}

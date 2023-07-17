package com.improve10x.phonenumberformat;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PhoneNumberFormatTest {

    private PhoneNumber phoneNumber;

    @Before
    public void setup() {
        phoneNumber = new PhoneNumber();
    }

    public void nothing() {
    }

    /*formatPhoneNumber([1, 2, 3, 4, 5, 6, 7, 8, 9, 0]) ➞ "(123) 456-7890"*/
    @Test
    public void givenPhoneNumberInArray_returnPhoneNumber() {
        String number = phoneNumber.formatPhoneNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0});
        assertEquals("(123) 456-7890", number);
    }

    //formatPhoneNumber([5, 1, 9, 5, 5, 5, 4, 4, 6, 8]) ➞ "(519) 555-4468"

    @Test
    public void givenPhoneNumberInArray_returnStrPhoneNumber() {
        String number = phoneNumber.formatPhoneNumber(new int[]{5, 1, 9, 5, 5, 5, 4, 4, 6, 8});
        assertEquals("(519) 555-4468", number);
    }

    //formatPhoneNumber([3, 4, 5, 5, 0, 1, 2, 5, 2, 7]) ➞ "(345) 501-2527"
    @Test
    public void givenPhoneNumberInArray_returnConvertPhoneNumber() {
        String number = phoneNumber.formatPhoneNumber(new int[]{3, 4, 5, 5, 0, 1, 2, 5, 2, 7});
        assertEquals("(345) 501-2527", number);
    }
}

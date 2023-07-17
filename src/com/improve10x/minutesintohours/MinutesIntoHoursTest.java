package com.improve10x.minutesintohours;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinutesIntoHoursTest {

    private  MinutesIntoHours minutesIntoHours;

    @Before
    public void setup() {
        minutesIntoHours = new MinutesIntoHours();
    }

    @Test
    public void nothing() {}

    // input minutes -0 , expected hours output -0
    @Test
    public void givenZeroMinutes_returnHourZero() {
        int hours = minutesIntoHours.convertedMinutesIntoHours(0);
        assertEquals(0, hours);
    }

    // input minutes - 60 , expected hours output -1
    @Test
    public void givenSixtyMinutes_returnOneHour() {
        int hours = minutesIntoHours.convertedMinutesIntoHours(60);
        assertEquals(1, hours);
    }

    // input minutes - 60 , expected hours output -1
    @Test
    public void givenOneTwentyMinutes_returnTwoHours() {
        int hours = minutesIntoHours.convertedMinutesIntoHours(120);
        assertEquals(2, hours);
    }

    // input minutes - 60 , expected hours output -1
    @Test
    public void givenNinetyMinutes_returnTwoHours() {
        int hours = minutesIntoHours.convertedMinutesIntoHours(120);
        assertEquals(2, hours);
    }

    // input minutes - 1440 , expected hours output -24
    @Test
    public void givenFourteenHundredAndFortyMinutes_returnTwentyFourHours() {
        int hours = minutesIntoHours.convertedMinutesIntoHours(1440);
        assertEquals(24, hours);
    }

    // input minutes - 1440 , expected hours output -24
    @Test
    public void givenSevenHundredAndTwentyMinutes_returnTwelveHours() {
        int hours = minutesIntoHours.convertedMinutesIntoHours(720);
        assertEquals(12, hours);
    }
}

package com.improve10x.minutesintoseconds;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinutesIntoSecondsTest {

    @Test
    public void nothing() {

    }

    @Test
    public void giveZeroMinutes_returnSeconds() {
        Minutes minutes = new Minutes();
        int seconds = minutes.convertMinutesIntoSeconds(0);
        assertEquals(0, seconds);
    }
    // input 5 - output 300
    @Test
    public void giveFiveMinutes_returnSeconds() {
        Minutes minutes = new Minutes();
        int seconds = minutes.convertMinutesIntoSeconds(5);
        assertEquals(300, seconds);
    }


    // input 10 - output 600
    @Test
    public void giveTenMinutes_returnSeconds() {
        Minutes minutes = new Minutes();
        int seconds = minutes.convertMinutesIntoSeconds(10);
        assertEquals(600, seconds);
    }

    //input 15 - output 900
    @Test
    public void giveFifteenMinutes_returnSeconds() {
        Minutes minutes = new Minutes();
        int seconds = minutes.convertMinutesIntoSeconds(15);
        assertEquals(900, seconds);
    }
}



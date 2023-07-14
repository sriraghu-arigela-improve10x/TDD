package com.improve10x.minutesintoseconds;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinutesIntoSecondsTest {

    @Test
    public void nothing() {

    }

    @Test
    public void giveFiveMinutes_returnSeconds() {
        Minutes minutes = new Minutes();
        int seconds = minutes.convertMinutesIntoSeconds(5);
        assertEquals(300, seconds);
    }

    @Test
    public void giveTenMinutes_returnSeconds() {
        Minutes minutes = new Minutes();
        int seconds = minutes.convertMinutesIntoSeconds(10);
        assertEquals(600, seconds);
    }

    @Test
    public void giveFifteenMinutes_returnSeconds() {
        Minutes minutes = new Minutes();
        int seconds = minutes.convertMinutesIntoSeconds(15);
        assertEquals(900, seconds);
    }
}



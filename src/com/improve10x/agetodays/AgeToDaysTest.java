package com.improve10x.agetodays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.security.PublicKey;

import static org.junit.Assert.assertEquals;

public class AgeToDaysTest {

    private AgeToDays ageToDays;

    @Before
    public void setup() {
        ageToDays = new AgeToDays();
    }

    @Test
    public void nothing(){}

    //input 0 - expected - 1

    @Test
    public void givenZeroDays_returnZeroAge() {
        int days = ageToDays.convertAgeToDays(0);
        assertEquals(1, days);
    }

    @Test
    public void givenNegativeNumber_returnSame() {
        int days = ageToDays.convertAgeToDays(-10);
        assertEquals(-1, days);
    }

    @Test
    public void givenOneYear_returnSame() {
        int days = ageToDays.convertAgeToDays(1);
        assertEquals(365, days);
    }

    @Test
    public void givenTwoYears_returnSame() {
        int days = ageToDays.convertAgeToDays(2);
        assertEquals(730, days);
    }

    @Test
    public void givenFiveYears_returnSame() {
        int days = ageToDays.convertAgeToDays(5);
        assertEquals(1825, days);
    }
    //input 10 - expected - 3650
    @Test
    public void givenThreeThousandSixHundredAndFiftyDays_returnAgeTen() {
        int days = ageToDays.convertAgeToDays(10);
        assertEquals(3650, days);
    }

    //input 20 - expected - 7300
    @Test
    public void givenSevenThousandThreeHundredDays_returnAgeTwenty() {
        int days = ageToDays.convertAgeToDays(20);
        assertEquals(7300, days);
    }

    //input 30 - expected - 10950
    @Test
    public void givenTenThousandSixHundredFiftyDays_returnAgeThirty() {
        int days = ageToDays.convertAgeToDays(30);
        assertEquals(10950, days);
    }

    //input 60 - expected - 10950
    @Test
    public void givenTwentyOneThousandNineHundredDays_returnAgeSixty() {
        int days = ageToDays.convertAgeToDays(60);
        assertEquals(21900, days);
    }
}

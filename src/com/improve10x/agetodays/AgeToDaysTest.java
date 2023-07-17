package com.improve10x.agetodays;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.security.PublicKey;

public class AgeToDaysTest {

    private AgeToDays ageToDays;

    @Before
    public void setup() {
        ageToDays = new AgeToDays();
    }

    @Test
    public void nothing(){}

    //input 0 - expected - 0

    @Test
    public void givenZeroDays_returnZeroAge() {
        int days = ageToDays.convertAgeToDays(0);
        Assert.assertEquals(0, days);
    }

    //input 10 - expected - 3650
    @Test
    public void givenThreeThousandSixHundredAndFiftyDays_returnAgeTen() {
        int days = ageToDays.convertAgeToDays(10);
        Assert.assertEquals(3650, days);
    }

    //input 20 - expected - 7300
    @Test
    public void givenSevenThousandThreeHundredDays_returnAgeTwenty() {
        int days = ageToDays.convertAgeToDays(20);
        Assert.assertEquals(7300, days);
    }

    //input 30 - expected - 10950
    @Test
    public void givenTenThousandSixHundredFiftyDays_returnAgeThirty() {
        int days = ageToDays.convertAgeToDays(30);
        Assert.assertEquals(10950, days);
    }

    //input 60 - expected - 10950
    @Test
    public void givenTwentyOneThousandNineHundredDays_returnAgeSixty() {
        int days = ageToDays.convertAgeToDays(60);
        Assert.assertEquals(21900, days);
    }
}

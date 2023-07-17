package com.improve10x.hourstominutesintoseconds;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HoursToMinutesIntoSecondsTest {

    private HoursToMinutesIntoSeconds hoursToMinutesIntoSeconds;

    @Before
    public void setup() {
        hoursToMinutesIntoSeconds = new HoursToMinutesIntoSeconds();
    }

    @Test
    public void nothing() {}

    //input hours-0, minutes-0, expected seconds- 0
    @Test
    public void givenZeroHoursToMinutes_returnZeroSeconds(){
        int seconds = hoursToMinutesIntoSeconds.findSeconds(0, 0);
        assertEquals(0, seconds);
    }

    //input hours-1, minutes-60, expected seconds- 7200
    @Test
    public void givenOneHourSixtyMinutes_returnSevenThousandTwoHundredSeconds(){
        int seconds = hoursToMinutesIntoSeconds.findSeconds(1, 60);
        assertEquals(7200, seconds);
    }

    //input hours-1, minutes-5, expected seconds- 0
    @Test
    public void givenOneHourFiveMinutes_returnThreeThousandNineHundredSeconds(){
        int seconds = hoursToMinutesIntoSeconds.findSeconds(1, 5);
        assertEquals(3900, seconds);
    }

    //input hours-1, minutes-30, expected seconds- 5400
    @Test
    public void givenOneHourThirtyMinutes_returnFiveThousandFourHundredSeconds(){
        int seconds = hoursToMinutesIntoSeconds.findSeconds(1, 30);
        assertEquals(5400, seconds);
    }

    //input hours-1, minutes-15, expected seconds- 4500
    @Test
    public void givenOneHourFifteenMinutes_returnFourThousandFiveHundredSeconds(){
        int seconds = hoursToMinutesIntoSeconds.findSeconds(1, 15);
        assertEquals(4500, seconds);
    }

    //input hours-2, minutes-49, expected seconds- 10140
    @Test
    public void givenTwoHourFortyNineMinutes_returnTenThousandOneHundredAndFortySeconds(){
        int seconds = hoursToMinutesIntoSeconds.findSeconds(2, 49);
        assertEquals(10140, seconds);
    }
}

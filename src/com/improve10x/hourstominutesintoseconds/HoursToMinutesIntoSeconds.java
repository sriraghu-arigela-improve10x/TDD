package com.improve10x.hourstominutesintoseconds;

public class HoursToMinutesIntoSeconds {
    public int findSeconds(int hours, int minutes) {
        int seconds = 0;
        seconds = hours * 3600 + minutes * 60;
        return seconds;
    }
}

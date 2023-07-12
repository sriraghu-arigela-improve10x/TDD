package com.improve10x.Scoring;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ScoringTest {

    private Scoring scoring;

    @Before
    public void setData() {
        scoring = new Scoring();
    }

    @Test
    public void nothing() {
    }

    /*
    Calculate Score - (null)  = {0, 0, 0}
    Calculate Score - ("")  = {0, 0, 0}
    Calculate Score - ("B")  = {0, 1, 0}
    Calculate Score - ("C")  = {0, 0, 1}
    Calculate Score - ("AB")  = {1, 1, 0}
    Calculate Score - ("ABC")  = {1, 1, 1}
    Calculate Score - ("AABC")  = {2, 1, 1}
    Calculate Score - ("ABBC")  = {1, 2, 1}
    Calculate Score - ("ABCC")  = {1, 1, 2}
    Calculate Score - ("ABCBACC")  = {2, 2, 3}
    */

    @Test
    public void givenNUll_returnAllZeros() {
        int[] allZeros = scoring.calculateScores(null);
        assertArrayEquals(new int[3], allZeros);
    }

    @Test
    public void givenEmpty_returnAllZeros(){
        int[] allZeros = scoring.calculateScores("");
        assertArrayEquals(new int[3], allZeros);
    }

    @Test
    public void givenAScore_returnOneZeroZero() {
        int[] onlyAScores = scoring.calculateScores("A");
        assertArrayEquals(new int[] {1, 0, 0}, onlyAScores);
    }

    @Test
    public void givenBScore_returnsZeroOneZero(){
        int[] onlyBScores = scoring.calculateScores("B");
        assertArrayEquals(new int[]{0, 1, 0}, onlyBScores);
    }

    @Test
    public void givenCScore_returnsZeroZeroOne(){
        int[] onlyCScores = scoring.calculateScores("C");
        assertArrayEquals(new int[]{0, 0, 1}, onlyCScores);
    }

    @Test
    public void givenABScores_returnsOneOneZero(){
        int[] onlyABScores = scoring.calculateScores("AB");
        assertArrayEquals(new int[] {1, 1, 0}, onlyABScores);
    }

    @Test
    public void givenABCScores_returnsOneOneOne(){
        int[] onlyABCScores = scoring.calculateScores("ABC");
        assertArrayEquals(new int[] {1, 1, 1}, onlyABCScores);
    }

    @Test
    public void givenAABCScores_returnsTwoOneOne(){
        int[] onlyAABCScores = scoring.calculateScores("AABC");
        assertArrayEquals(new int[] {2, 1, 1}, onlyAABCScores);
    }

    @Test
    public void givenABBCScores_returnsOneTwoOne(){
        int[] onlyABBCScores = scoring.calculateScores("ABBC");
        assertArrayEquals(new int[] {1, 2, 1}, onlyABBCScores);
    }

    @Test
    public void givenABCCScores_returnsOneOneTwo(){
        int[] onlyABCCScores = scoring.calculateScores("ABCC");
        assertArrayEquals(new int[] {1, 1, 2}, onlyABCCScores);
    }

    @Test
    public void givenABCBACCScores_returnsTwoTwoThree(){
        int[] onlyABCBACCcores = scoring.calculateScores("ABCBACC");
        assertArrayEquals(new int[] {2, 2, 3}, onlyABCBACCcores);
    }
}

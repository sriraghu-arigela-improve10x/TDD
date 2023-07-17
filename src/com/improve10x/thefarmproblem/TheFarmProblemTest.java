package com.improve10x.thefarmproblem;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TheFarmProblemTest {

    private TheFarm theFarm;

    @Before
    public void setup() {
        theFarm = new TheFarm();
    }

    @Test
    public void nothing() {}

    // input noOfChickenLegs -0, noOfCowsLegs-0, noOfPigsLegs- 0 -- output totalLegs- 0
    @Test
    public void givenNoOfAnimalsLegsEmpty_returnsTotalAnimalsLegsEmpty() {
        int animalLegs = theFarm.findAnimalLegs(0, 0, 0);
        assertEquals(0,animalLegs);
    }

    // // input noOfChickenLegs -2, noOfCowsLegs-4, noOfPigsLegs-4 -- output totalLegs- 36
    @Test
    public void givenTwoANdFourAndFourAnimals_returnsTotalAnimalLegsThirtySix() {
        int animalLegs = theFarm.findAnimalLegs(2,4,4);
        assertEquals(36, animalLegs);
    }

    // // input noOfChickenLegs -2, noOfCowsLegs-4, noOfPigsLegs-4 -- output totalLegs- 36
    @Test
    public void givenTwoANdThreeAndFiveAnimals_returnsTotalAnimalLegsThirtySix() {
        int animalLegs = theFarm.findAnimalLegs(2,3,5);
        assertEquals(36, animalLegs);
    }

    // // input noOfChickenLegs -1, noOfCowsLegs-3, noOfPigsLegs-2 -- output totalLegs- 22
    @Test
    public void givenTwoANdThreeAndFiveAnimals_returnsTotalAnimalLegsTwentyTwo() {
        int animalLegs = theFarm.findAnimalLegs(1,3,2);
        assertEquals(22, animalLegs);
    }

    // // input noOfChickenLegs -1, noOfCowsLegs-3, noOfPigsLegs-2 -- output totalLegs- 22
    @Test
    public void givenFiveANdTwoAndEightAnimals_returnsTotalAnimalLegsFifty() {
        int animalLegs = theFarm.findAnimalLegs(5,2,8);
        assertEquals(50, animalLegs);
    }

    // // input noOfChickenLegs -1, noOfCowsLegs-3, noOfPigsLegs-2 -- output totalLegs- 22
    @Test
    public void givenTenANdTenAndTenAnimals_returnsTotalAnimalLegsHundred() {
        int animalLegs = theFarm.findAnimalLegs(10,10,10);
        assertEquals(100, animalLegs);
    }
}

package com.improve10x.thefarmproblem;

public class TheFarm {
    public int findAnimalLegs(int chickenLegs, int cowLegs, int pigLegs) {
        int noOfChickenLegs = chickenLegs * 2;
        int noOfCowLegs = cowLegs * 4;
        int noOfPigLegs = pigLegs * 4;
        int totalAnimalLegs = noOfChickenLegs + noOfCowLegs + noOfPigLegs;
        return totalAnimalLegs;
    }
}

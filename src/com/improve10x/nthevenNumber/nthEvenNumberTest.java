package com.improve10x.nthevenNumber;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class nthEvenNumberTest {

    private NthEvenNumber nthEvenNumber;

    @Before
    public void setup() {
        nthEvenNumber = new NthEvenNumber();
    }

    @Test
    public void nothing(){}

    //input 0 - expected output -0
    @Test
    public void givenEvenNumberIsZero_returnEvenNumberIsZero(){
        int evenNumber = nthEvenNumber.findEvenNumber(0);
        assertEquals(0, evenNumber);
    }

    //input 10 - expected output -18

    @Test
    public void givenEvenNumberIsTen_returnEvenNumberIsEighteen(){
        int evenNumber = nthEvenNumber.findEvenNumber(10);
        assertEquals(18, evenNumber);
    }

    //input 6 - expected output - 8
    @Test
    public void givenEvenNumberIsSix_returnEvenNumberIsEight(){
        int evenNumber = nthEvenNumber.findEvenNumber(6);
        assertEquals(10, evenNumber);
    }


    //input 100 - expected output - 198
    @Test
    public void givenEvenNumberIsHundred_returnEvenNumberIsOneNinetyEight(){
        int evenNumber = nthEvenNumber.findEvenNumber(100);
        assertEquals(198, evenNumber);
    }

    //input 60 - expected output - 118
    @Test
    public void givenEvenNumberIsSixty_returnEvenNumberIsOneOneEight(){
        int evenNumber = nthEvenNumber.findEvenNumber(60);
        assertEquals(118, evenNumber);
    }

    //input 100 - expected output - 198
    @Test
    public void givenEvenNumberIsThousand_returnEvenNumberIsNineteenNinetyEight(){
        int evenNumber = nthEvenNumber.findEvenNumber(1000);
        assertEquals(1998, evenNumber);
    }
}

package com.improve10x.findbomb;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindBombTest {
    private FindBomb findBomb;

    @Before
    public void setUp() {
        findBomb = new FindBomb();
    }

    @Test
    public void nothing() {
    }

    //bomb("There is a bomb.") ➞ "DUCK!"
    @Test
    public void givenThereIsABomb_returnDUCKWithExclamationMark() {
        String text = findBomb.CheckWord("There is a bomb.");
        assertEquals("DUCK!", text);
    }

    //bomb("Hey, did you think there is a BOMB?") ➞ "DUCK!"
    @Test
    public void givenText_returnDUCKWithExclamationMark() {
        String text = findBomb.CheckWord("Hey, did you think there is a BOMB?");
        assertEquals("DUCK!", text);
    }

    //bomb("This goes boom!!!") ➞ "Relax, there's no bomb."
    @Test
    public void givenText_returnRelax() {
        String text = findBomb.CheckWord("This goes boom!!!");
        assertEquals("Relax, there's no bomb.", text);
    }
}


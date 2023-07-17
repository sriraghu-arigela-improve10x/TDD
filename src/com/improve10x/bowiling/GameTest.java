package com.improve10x.bowiling;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    private Game game;

    private void rollMany(int noOfRolls, int pins) {
        for(int i = 0; i < noOfRolls; i++){
            game.roll(pins);
        }
    }
    

    @Before
    public void setup(){
        game = new Game();
    }

    @Test
    public void nothing(){}

    @Test
    public void canRoll() {
        game.roll(1);
    }

    @Test
    public void gutterGame() {
        rollMany(20, 0);
        assertEquals(0, game.score());
    }

    @Test
    public void allOnes() {
        rollMany(20, 1);
        assertEquals(20, game.score());
    }
}

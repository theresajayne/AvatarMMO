package com.github.avatarmmo.utilities;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class TestDice {

    @Test
    public void canCreateADiceRoller()
    {
        Dice dice = new Dice();
        assertNotNull(dice);
    }

    @Test
    public void canGetARandomNumberFromADiceRoll()
    {
        Dice dice = new Dice();
        int count = 100;
        //loop to test multiple times to ensure
        int result = 0;
        for(int loop = 0;loop<count;loop++){
            result = dice.roll();
            assertTrue(result > 0);
            assertTrue(result < 7);
        }
    }
}

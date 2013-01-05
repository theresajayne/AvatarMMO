package com.github.avatarmmo.entities;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class TestCharacter {

    @Test
    public void shouldBeAbleToCreateACharacter()
    {
        Character character = new Character();
        assertNotNull(character);
    }

    @Test
    public void aCharacterHasSomeStats()
    {
        //not normal to test multiples but this speeds up entity derivation
        Character character = new Character();
        int result = character.getStrength();
        assertNotNull(result);
        result = character.getDexterity();
        assertNotNull(result);
        result = character.getWisdom();
        assertNotNull(result);
        result = character.getCharisma();
        assertNotNull(result);
        result = character.getIntelligence();
        assertNotNull(result);
        result = character.getConstitution();
        assertNotNull(result);
        result = character.getLevel();
        assertNotNull(result);
        result = character.getXPos();
        assertNotNull(result);
        result = character.getYPos();
        assertNotNull(result);
        result = character.getZPos();
        assertNotNull(result);
        result = character.getRange();
        assertNotNull(result);
        result = character.getSpeed();
        assertNotNull(result);

    }
}

package com.github.avatarmmo.entities;

/**
 * Created with IntelliJ IDEA.
 * User: Theresa
 * Date: 05/01/13
 * Time: 16:25
 * To change this template use File | Settings | File Templates.
 */
public class Character {
    private int strength;
    private int dexterity;
    private int wisdom;
    private int charisma;
    private int constitution;
    private int intelligence;
    private int level;
    private int XPos;
    private int YPos;
    private int ZPos;
    private int range;
    private int speed;

    public Character() {
    }

    public int getStrength() {
        return strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getCharisma() {
        return charisma;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getConstitution() {
        return constitution;
    }

    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public void setCharisma(int charisma) {
        this.charisma = charisma;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getLevel() {
        return level;
    }

    public int getXPos() {
        return XPos;
    }

    public int getYPos() {
        return YPos;
    }

    public int getZPos() {
        return ZPos;
    }

    public int getRange() {
        return range;
    }

    public int getSpeed() {
        return speed;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setXPos(int XPos) {
        this.XPos = XPos;
    }

    public void setYPos(int YPos) {
        this.YPos = YPos;
    }

    public void setZPos(int ZPos) {
        this.ZPos = ZPos;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}

package com.github.avatarmmo.utilities;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: Theresa
 * Date: 05/01/13
 * Time: 17:14
 * To change this template use File | Settings | File Templates.
 */
public class Dice {

    private int sides;
    private Random generator;

    public Dice()
    {
        setSides(6);
    }

    public Dice(int sides){
        setSides(sides);
    }

    private void setSides(int sides) {
        this.sides = sides;
        this.generator = new Random(System.currentTimeMillis());
    }

    public int roll() {
        return this.generator.nextInt(this.sides)+1;
    }
}

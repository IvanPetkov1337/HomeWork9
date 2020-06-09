package com.company;
import java.util.Random;

/**
 * Родителски клас на почти всички класове в апликацията
 */

public class Machine {
    Random rand = new Random();

    protected float MHeight;
    protected int MPower;
    protected String MColor;
    protected String [] Color = new String [] {"Green", "Red", "Blue"};


    public Machine(){
        MHeight = (float) (1.00 + rand.nextFloat() * (40.00 - 1.00));

        MPower = rand.nextInt(100);

        MColor = Color[rand.nextInt(3)];




    }



    public int getMPower() {
        return MPower;
    }

    public void setMPower(int power) {
        MPower = power;
    }


    public float getMHeight() {
        return MHeight;
    }

    public void setMHeight(float height) {
        MHeight = height;
    }


    public String getMColor() {
        return MColor;
    }

    public void setMColor (String color) {
        MColor = color;
    }
}

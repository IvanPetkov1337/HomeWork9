package com.company;

public class HeatManager  {
    public HeatManager(Machine HeatM, Machine WrapperM) {
        System.out.print("\nMax power of heat machine: " + HeatM.getMPower() + "\n");
        System.out.print("Max power of wrapper machine: " + WrapperM.getMPower() + "\n");
    }

}

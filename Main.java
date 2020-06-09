package com.company;
import java.util.Scanner;

/**
 * @author Ivan Petkov
 * Фабрика на мечтите
 */

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many wrapper engines and heat engines do you want? \n");
        int MachineCount = scan.nextInt();


        WrapperEngine[] Wrap = new WrapperEngine[MachineCount];
        HeatEngine[] Heat = new HeatEngine[MachineCount];

        for (int i = 0; i < Heat.length; i++) {
            Heat[i] = new HeatEngine();
            Wrap[i] = new WrapperEngine();
            System.out.println("\nMachine number " + (i+1) );
            new HeatManager(Heat[i],Wrap[i]);
        }



    }

}

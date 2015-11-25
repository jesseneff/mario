package com.mario;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        StrategyFactory outputFactory = new StrategyFactory();
        int n;
        String choice;

        //start input 1
        do {
            System.out.print("Will this be written to a file? (Y|N): ");
            choice = input.next().toLowerCase();
            System.out.println();
        }
        while (!choice.equals("yes") &
                !choice.equals("no") &
                !choice.equals("y") &
                !choice.equals("n"));

        //start input 2
        do {
            System.out.print("Please enter a valid height of the pyramid (0 <= n <= 23): ");
            n = input.nextInt();
            System.out.println();
        }
        while (n < 0 || n > 23);

        //new pyramid according to spec
        Pyramid pyramid = new Pyramid().makePyramid(n);

        //decide how to output based on input
        if (choice.equals("y") || choice.equals("yes")){
            OutputStrategy fileOutput = outputFactory.GetStrategy("file");
            fileOutput.output(pyramid);
        }
        //output to console
        else{
            OutputStrategy consoleOutput = outputFactory.GetStrategy("console");
            consoleOutput.output(pyramid);
        }
    }
}

package com.mario;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n;
        String choice;
        ArrayList<String> lines = new ArrayList<>();

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
        //populate list with output
        for (int i = 1; i < n ; i++){
            String spaces = new String(new char[(n-1)-i]).replace('\0', ' ');
            String hashes = new String(new char[i+1]).replace('\0', '#');
            lines.add(spaces+hashes);
        }


        StrategySetting fileOutput = new StrategySetting(new FileStrategy());
        StrategySetting consoleOutput = new StrategySetting(new ConsoleStrategy());

        //decide how to output based on input
        if (choice.equals("y") || choice.equals("yes")){
            fileOutput.output(lines);
        }
        //output to console
        else{
            consoleOutput.output(lines);
        }
    }
}

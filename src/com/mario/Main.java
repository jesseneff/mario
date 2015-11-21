package com.mario;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n;
        String choice;

        //start input 1
        do {
            System.out.print("Will this be written to a file? (Y|N): ");
            choice = input.next().toLowerCase();
            System.out.println();
        }
        while (!choice.equals("yes") &&
                !choice.equals("no") &&
                !choice.equals("y") &&
                !choice.equals("n")
                );

        //start input 2
        do {
            System.out.print("Please enter the height of the pyramid (0 <= n <= 23): ");
            n = input.nextInt();
            System.out.println();
        }
        while (n < 0 || n > 23);

        //create file
        if (choice.equals("y") || choice.equals("yes")){

            String fileName = "output.txt";

            try (FileWriter fileWriter = new FileWriter(new File(fileName));) {
                for (int i = 1; i < n ; i++) {
                    String spaces = new String(new char[(n - 1) - i]).replace('\0', ' ');
                    String hashes = new String(new char[i + 1]).replace('\0', '#');
                    fileWriter.write(spaces + hashes);
                    fileWriter.write(System.lineSeparator());
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            System.out.println("File saved.");
        }
        //output to console
        else{
            for (int i = 1; i < n ; i++){
                String spaces = new String(new char[(n-1)-i]).replace('\0', ' ');
                String hashes = new String(new char[i+1]).replace('\0', '#');
                System.out.println(spaces+hashes);
            }
        }
    }
}

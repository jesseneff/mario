package com.mario;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n;

        do {
            System.out.print("Please enter the height of the pyramid (0 <= n <= 23): ");
            n = input.nextInt();
            System.out.println();
        }
        while (n < 0 || n > 23);

        for (int i = 1; i < n ; i++){
            String spaces = new String(new char[(n-1)-i]).replace('\0', ' ');
            String hashes = new String(new char[i+1]).replace('\0', '#');

            System.out.println(spaces+hashes);
        }

    }
}

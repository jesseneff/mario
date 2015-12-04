package com.jesse.mario;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileStrategy implements OutputStrategy {
    public void output(Pyramid pyramid) {
        String fileName = "output.txt";

        try (FileWriter fileWriter = new FileWriter(new File(fileName))) {
            fileWriter.write(pyramid.toString());
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        System.out.println("File saved.");
    }
}
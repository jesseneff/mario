package com.mario;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileStrategy implements OutputStrategy {
    @Override
    public void output(ArrayList<String> lines) {
        String fileName = "output.txt";
        int n = lines.size();

        try (FileWriter fileWriter = new FileWriter(new File(fileName))) {
            for (int i = 0; i < n; i++) {
                fileWriter.write(lines.get(i) + "\n");
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        System.out.println("File saved.");
    }
}
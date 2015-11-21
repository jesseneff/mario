package com.mario;

import java.util.ArrayList;

public class ConsoleStrategy implements OutputStrategy {
    @Override
    public void output(ArrayList<String> lines){
        int n = lines.size();

        for (int i = 0; i < n; i++) {
            System.out.println(lines.get(i));
        }
    }
}
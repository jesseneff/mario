package com.mario;

import java.util.ArrayList;

public class Pyramid extends ArrayList<String>{
        public static Pyramid makePyramid(int n){
            Pyramid pyramid = new Pyramid();
            for (int i = 1; i < n ; i++){
                String spaces = new String(new char[(n-1)-i]).replace('\0', ' ');
                String hashes = new String(new char[i+1]).replace('\0', '#');
                pyramid.add(spaces+hashes);
            }

            return pyramid;
        }

        @Override
        public String toString(){
            int n = this.size();
            StringBuilder s = new StringBuilder();

            for (int i = 0; i < n; i++) s.append(this.get(i) + "\n");


            return s.toString();
        }
}

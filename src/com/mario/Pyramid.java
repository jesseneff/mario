package com.mario;

import java.util.ArrayList;

public class Pyramid extends ArrayList<String>{
        public Pyramid makePyramid(int n){
            Pyramid pyramid = new Pyramid();
            for (int i = 1; i < n ; i++){
                String spaces = new String(new char[(n-1)-i]).replace('\0', ' ');
                String hashes = new String(new char[i+1]).replace('\0', '#');
                pyramid.add(spaces+hashes+"\n");
            }

            return pyramid;
        }

        @Override
        public String toString(){
            StringBuilder s = new StringBuilder();

            for (String s1 : this) s.append(s1);

            return s.toString();
        }
}

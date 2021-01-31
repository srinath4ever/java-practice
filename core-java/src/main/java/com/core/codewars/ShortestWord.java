package com.core.codewars;

public class ShortestWord {

    public static int findShort(String s) {
        int min = Integer.MAX_VALUE;
        for(String word : s.split(" ")){
            min = Math.min(min, word.length());
        }
        return min;
    }

}

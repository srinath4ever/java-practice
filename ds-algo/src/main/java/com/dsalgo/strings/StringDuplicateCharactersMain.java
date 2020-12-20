package com.dsalgo.strings;

import java.util.HashSet;
import java.util.Set;

/**
 * given a string,
 * 1. removes duplicate characters
 * 2. print number of duplicates with their counts
 *
 * @author Srinath.Rayabarapu
 */
public class StringDuplicateCharactersMain {

    public static void main(String[] args) {
        String input = "aacccddddeeeegfggssss";

        //output: acdegfs
        removeDuplicatesUsingHashSet(input);
        removeDuplicatesUsingArrays(input);

        printDuplicatesWithCount(input);
        printMaxDuplicateWithCount(input);
    }

    /**
     * it prints only last max char with count
     *
     * @param input
     */
    private static void printMaxDuplicateWithCount(String input) {
        int[] asciiArray = new int[256];
        for (char c : input.toCharArray()) { // O(n) time
            asciiArray[c]++;
        }
        char maxDuplicate = ' ';
        int count=0;
        for (int i = 0; i < asciiArray.length; i++) { //constant time
            if (asciiArray[i] != 0) {
                maxDuplicate = (char) i;
                if(count < asciiArray[i]){
                    count = asciiArray[i];
                }
            }
        }
        System.out.printf("%s is max with count %d", maxDuplicate, count);
    }

    private static void printDuplicatesWithCount(String input) {
        int[] asciiArray = new int[256];
        for (char c : input.toCharArray()) { // O(n) time
            asciiArray[c]++;
        }
        for (int i = 0; i < asciiArray.length; i++) { //constant time
            if(asciiArray[i] != 0){
                System.out.printf("%s with count : %d%n", (char)i, asciiArray[i]);
            }
        }
    }

    private static void removeDuplicatesUsingArrays(String input) {
        int[] asciiArray = new int[256];
        for (char c : input.toCharArray()) { // O(n) time
            asciiArray[c]++;
        }
        String unique = "";
        for (int i = 0; i < asciiArray.length; i++) { //constant time
            if(asciiArray[i] != 0){
                unique = unique + (char)i;
            }
        }
        System.out.println(unique);
    }

    private static void removeDuplicatesUsingHashSet(String input) {
        Set<Character> charSet = new HashSet<>();
        for (char c : input.toCharArray()) {
            charSet.add(c);
        }
        System.out.println(charSet);
    }

}

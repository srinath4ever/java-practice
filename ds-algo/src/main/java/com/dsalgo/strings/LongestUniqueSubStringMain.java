package com.dsalgo.strings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * given a string, find longest unique substrings in it.
 *
 * @author Srinath.Rayabarapu
 */
public class LongestUniqueSubStringMain {

    public static void main(String[] args) {
        //TODO -

        String abc = "eren";
        Set<String> set = new HashSet<>();

        Set<Integer> set1 = new HashSet<>();
        for (int i = 0; i < abc.length(); i++) {
            for (int j = i; j < abc.length(); j++) {
                set.add(abc.substring(i, j+1));
            }
        }

//        Arrays.asList(abc.toCharArray()).parallelStream()

        List<String> list = new ArrayList<>(set);
        list.sort((o1, o2) -> o1.compareTo(o2));
        System.out.println(list);

        int i = list.indexOf(abc);
        System.out.println(i+1);

    }

}
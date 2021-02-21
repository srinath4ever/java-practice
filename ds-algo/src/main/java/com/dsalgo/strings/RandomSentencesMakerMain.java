package com.dsalgo.strings;

import com.strings.random.RandomSentenses;

/**
 * program to make random sentences from different string arrays.
 *
 * @author Srinath.Rayabarapu
 */
public class RandomSentencesMakerMain {
    public static void main(String[] ar) {
        RandomSentenses arrays = new RandomSentenses();
        arrays.formSentences();
        arrays.showSentences();
    }
}


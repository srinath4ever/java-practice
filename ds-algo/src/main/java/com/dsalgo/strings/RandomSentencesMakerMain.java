package com.dsalgo.strings;

/**
 * program to make random sentences from different string arrays.
 *
 * @author Srinath.Rayabarapu
 */
public class RandomSentencesMakerMain {
    public static void main(String[] ar) {
        CreateSentences arrays = new CreateSentences();
        arrays.formSentences();
        arrays.showSentences();
    }
}

class CreateSentences {

    String[] article = {"the", "a", "one", "some"};
    String[] noun = {"boy", "girl", "dog", "town", "car"};
    String[] verb = {"drove", "jumped", "ran", "walked", "skipped"};
    String[] prepo = {"to", "from", "over", "under", "on"};
    int a_index, n_index, v_index, p_index, j;
    String[] s = {"", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""};

    void formSentences() {
        for (int i = 0; i < 25; i++) {
            a_index = 0 + (int) (3 * Math.random());
            n_index = 0 + (int) (4 * Math.random());
            v_index = 0 + (int) (4 * Math.random());
            p_index = 0 + (int) (4 * Math.random());

            s[i] = s[i] + article[a_index];
            s[i] = s[i] + " " + noun[n_index];
            s[i] = s[i] + " " + verb[v_index];
            s[i] = s[i] + " " + prepo[p_index];

            a_index = 0 + (int) (3 * Math.random());
            n_index = 0 + (int) (4 * Math.random());

            s[i] = s[i] + " " + article[a_index];
            s[i] = s[i] + " " + noun[n_index];
        }
    }

    void showSentences() {
        for (int i = 0; i < 25; i++) {
            System.out.print(Character.toUpperCase(s[i].charAt(0)));
            for (int j = 1; j < s[i].length(); j++)
                System.out.print(s[i].charAt(j));
            System.out.println(".");
        }
    }

}
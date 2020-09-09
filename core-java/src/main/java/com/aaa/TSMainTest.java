package com.aaa;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Srinath Rayabarapu
 */
public class TSMainTest {

    @Test
    public void testTescoString() {
        List<String> input = new ArrayList<>();
        input.add("abctesco");
        input.add("abctescoxyz");
        input.add("tesco");
        input.add("TESCOxyz");
        input.add("abctes");
        input.add("aTeSCo");
        input.add("abcsco");
        List<String> stringTesco = new TSMain().findStringTesco(input, "Tesco");
        System.out.println(stringTesco);
        Assert.assertEquals(5, stringTesco.size());
    }

}
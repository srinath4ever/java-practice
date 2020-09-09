package com.puzzles;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

/**
 * test class for {@link VowelCountMain}
 *
 * @author srinath rayabarapu
 */
public class VowelCountMainTest {

    @Test
    public void testCase1() {
        assertEquals("Nope!", 5, VowelCountMain.getCountLinear("abracadabra"));
    }

    @Test
    public void testCase2() {
        assertEquals("Nope!", 5, VowelCountMain.getCountClever("abracadabra"));
    }

}
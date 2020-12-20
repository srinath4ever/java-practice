package com.puzzles;

/**
 * Program to reverse an integer
 * <p>
 * logic : get divisor by 10 and add it reverse number * 10
 *
 * @author Srinath.Rayabarapu
 */
public class NumberIntegerReverseMain {

    public static void main(String[] args) {
        int a = 123456789;
        approach1(a);
    }

    private static void approach1(int a) {
        int reverse = 0;
        while (a != 0) {
            reverse = (reverse * 10) + (a % 10);
            a = a / 10;
        }
        System.out.println(reverse);
    }

}
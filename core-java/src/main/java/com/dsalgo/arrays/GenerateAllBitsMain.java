package com.dsalgo.arrays;

import com.util.LogUtil;

import java.util.Arrays;

/**
 * print all binary combinations in a array
 *
 * It's a Backtracking problem
 *
 * @author Srinath.Rayabarapu
 */
public class GenerateAllBitsMain {

    public static void main(String[] args) {
        int[] inputArray = new int[3];
        binary(inputArray, inputArray.length);
    }

    private static void binary(int[] inputArray, int index) {
        if(index < 1){
            LogUtil.info(Arrays.toString(inputArray));
        } else {
            inputArray[index-1] = 0;
            binary(inputArray, index-1);
            inputArray[index-1] = 1;
            binary(inputArray, index-1);
        }
    }

}

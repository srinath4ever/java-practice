package com.dsalgo.arrays;

/**
 * given two sorted arrays, merge them.
 *
 * TODO - need to implement few methods
 *
 * @author Srinath.Rayabarapu
 */
public class MergeTwoSortedArraysMain {

    private static int INVALID_NUM = 0;

    public static void main(String[] args) {

        // 1. usecase where you can create an extra array as target
        int[] intArray1 = {1, 2, 3, 5, 6, 7, 11};
        int[] intArray2 = {2, 4, 6, 8, 16};
        mergeTwoSortedArraysWithExtraSpace(intArray1, intArray2);

        int[] arr1 = {1, 2, 3, 5, 6, 7, 11};
        int[] arr2 = {2, 4, 6, 8, 16};
        mergeTwoSortedArraysWithExtraSpace1(arr1, arr2);

        // 2. usecase where one of the given arrays will be having extra space
        int[] a = {1, 3, 8, 9};
        int[] b = {2, 4, 5, 6, 7, 0, 0, 0, 0}; // last four as place holders for the merge
        mergeTwoSortedArraysWithOutExtraSpace(a, b);

        // 3. usecase similar to 2 but extra spaces are distributed in array
        int[] arrayA = {-3, 5, 0, 7, 0, 10, 0, 11, 0}; // in between '0' extra spaces
        int[] arrayB = {-1, 2, 6, 12};
        mergeTwoSortedArraysWithOutExtraSpace1(arrayA, arrayB);

    }

    // https://www.ideserve.co.in/learn/merge-two-sorted-arrays-without-extra-space
    private static void mergeTwoSortedArraysWithOutExtraSpace1(int[] arrayA, int[] arrayB) {


    }

    private static void mergeTwoSortedArraysWithOutExtraSpace(int[] a, int[] b) {

    }

    /**
     * Time complexity : O(n^2)
     *
     * @param intArray1
     * @param intArray2
     */
    private static void mergeTwoSortedArraysWithExtraSpace(int[] intArray1, int[] intArray2) {
        int[] targetArray = new int[intArray1.length + intArray2.length];

        int k = 0;
        int jPos = 0;

        for (int i = 0; i < intArray1.length; i++) {
            for (int j = jPos; j < intArray2.length; j++) {
                if (intArray1[i] < intArray2[j]) {
                    targetArray[k] = intArray1[i];
                    k++;
                    break;
                } else if (intArray1[i] >= intArray2[j]) {
                    targetArray[k] = intArray2[j];
                    jPos = j++;
                    k++;
                }
            }
        }

        for (int i : targetArray) {
            System.out.println(i);
        }
    }

    /**
     * Still using an extra array - but with less time complexity.
     * <p>
     * Time complexity - O(n)
     *
     * @param arr1
     * @param arr2
     */
    private static void mergeTwoSortedArraysWithExtraSpace1(int[] arr1, int[] arr2) {

        int size = arr1.length + arr2.length;
        int[] mergedArr = new int[size];

        int j = 0, k = 0;
        for (int i = 0; i < size; i++) {

            if (j >= arr1.length && k < arr2.length) {
                mergedArr[i] = arr2[k++];
                continue;
            } else if (k >= arr2.length && j < arr1.length) {
                mergedArr[i] = arr1[j++];
                continue;
            }

            int diff = arr1[j] - arr2[k];

            if (diff < 0) {
                mergedArr[i] = arr1[j++];
            } else if (diff > 0) {
                mergedArr[i] = arr2[k++];
            } else {
                mergedArr[i++] = arr1[j++];
                mergedArr[i++] = arr2[k++];
            }

        }

        for (int val : mergedArr) {
            System.out.print(val + " ");
        }

    }

}

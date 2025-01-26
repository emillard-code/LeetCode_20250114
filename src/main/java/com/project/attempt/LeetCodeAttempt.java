package com.project.attempt;

import java.util.Arrays;
import java.util.HashSet;

public class LeetCodeAttempt {

    public static void main(String[] args) {

        int[] A1 = new int[]{3,1,2,4};
        int[] B1 = new int[]{1,3,2,4};
        System.out.println(Arrays.toString(findThePrefixCommonArrayOfTwoArrays(A1, B1)));

        int[] A2 = new int[]{2,3,1};
        int[] B2 = new int[]{3,1,2};
        System.out.println(Arrays.toString(findThePrefixCommonArrayOfTwoArrays(A2, B2)));

    }

    // This method will find the prefix common array between arrays A and B as per challenge instructions.
    public static int[] findThePrefixCommonArrayOfTwoArrays(int[] A, int[] B) {

        // Array C will be the solution returned at the end of the method.
        // We'll use a set to store numbers that have been seen at least once.
        // Since all numbers can only appear once each in arrays A and B, we can use
        // the set to help test common numbers that have appeared in both arrays so far.
        int[] C = new int[A.length];
        HashSet numbers = new HashSet<Integer>();

        for (int i = 0; i < A.length; i++) {

            // All indexes of C[i] will by default include the counts from the previous index.
            if (i > 0) { C[i] = C[i] + C[i-1]; }

            // If the number at A[i] hasn't appeared yet, we add it to the set pool.
            // Otherwise, we remove it from the set if it has, and increment C[i] to
            // indicate that another common number has been found in both arrays.
            if (numbers.contains(A[i])) {
                numbers.remove(A[i]);
                C[i]++;
            } else {
                numbers.add(A[i]);
            }

            // If the number at B[i] hasn't appeared yet, we add it to the set pool.
            // Otherwise, we remove it from the set if it has, and increment C[i] to
            // indicate that another common number has been found in both arrays.
            if (numbers.contains(B[i])) {
                numbers.remove(B[i]);
                C[i]++;
            } else {
                numbers.add(B[i]);
            }

        }

        // We return the array C once all numbers between both arrays have been tested.
        return C;

    }

}

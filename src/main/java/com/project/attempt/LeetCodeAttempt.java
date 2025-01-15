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

    public static int[] findThePrefixCommonArrayOfTwoArrays(int[] A, int[] B) {

        int[] C = new int[A.length];
        HashSet numbers = new HashSet<Integer>();

        for (int i = 0; i < A.length; i++) {

            if (i > 0) { C[i] = C[i] + C[i-1]; }

            if (numbers.contains(A[i])) { numbers.remove(A[i]); C[i]++; }
            else { numbers.add(A[i]); }

            if (numbers.contains(B[i])) { numbers.remove(B[i]); C[i]++; }
            else { numbers.add(B[i]); }

        }

        return C;

    }

}

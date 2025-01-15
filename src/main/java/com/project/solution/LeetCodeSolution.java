package com.project.solution;

import java.util.Arrays;

public class LeetCodeSolution {

    public static void main(String[] args) {

        int[] A1 = new int[]{3,1,2,4};
        int[] B1 = new int[]{1,3,2,4};
        System.out.println(Arrays.toString(findThePrefixCommonArray(A1, B1)));

        int[] A2 = new int[]{2,3,1};
        int[] B2 = new int[]{3,1,2};
        System.out.println(Arrays.toString(findThePrefixCommonArray(A2, B2)));

    }

    public static int[] findThePrefixCommonArray(int[] A, int[] B) {

        int n = A.length;
        int[] prefixCommonArray = new int[n];

        // Loop through each index to calculate common elements for each prefix
        for (int currentIndex = 0; currentIndex < n; ++currentIndex) {

            int commonCount = 0;

            // Compare elements in A and B within the range of current prefix
            for (int aIndex = 0; aIndex <= currentIndex; ++aIndex) {

                for (int bIndex = 0; bIndex <= currentIndex; ++bIndex) {

                    // Check if elements match, and count if they do
                    if (A[aIndex] == B[bIndex]) {
                        ++commonCount;
                        break; // Prevent counting duplicates
                    }

                }

            }

            // Store the count of common elements for the current prefix
            prefixCommonArray[currentIndex] = commonCount;

        }

        // Return the final array with counts of common elements in each prefix
        return prefixCommonArray;

    }

}
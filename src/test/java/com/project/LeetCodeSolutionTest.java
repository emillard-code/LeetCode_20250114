package com.project;

import com.project.solution.LeetCodeSolution;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class LeetCodeSolutionTest {

    @Test
    public void findThePrefixCommonArrayOfTwoArraysTest() {

        int[] A1 = new int[]{3,1,2,4};
        int[] B1 = new int[]{1,3,2,4};
        int[] C1 = new int[]{0,2,3,4};

        assertArrayEquals(C1, LeetCodeSolution.findThePrefixCommonArray(A1, B1));

        int[] A2 = new int[]{2,3,1};
        int[] B2 = new int[]{3,1,2};
        int[] C2 = new int[]{0,1,3};

        assertArrayEquals(C2, LeetCodeSolution.findThePrefixCommonArray(A2, B2));

    }

}

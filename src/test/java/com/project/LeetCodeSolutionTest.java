package com.project;

import com.project.solution.LeetCodeSolution;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class LeetCodeSolutionTest {

    @Test
    public void minOperationsTest() {

        assertArrayEquals(new int[]{1,1,3}, LeetCodeSolution.minOperations("110"));
        assertArrayEquals(new int[]{11,8,5,4,3,4}, LeetCodeSolution.minOperations("001011"));

    }

}

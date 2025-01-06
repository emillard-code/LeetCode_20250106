package com.project;

import com.project.attempt.LeetCodeAttempt;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class LeetCodeAttemptTest {

    @Test
    public void minimumNumberOfOperationsToMoveAllBallsToEachBoxTest() {

        assertArrayEquals(new int[]{1,1,3}, LeetCodeAttempt.minimumNumberOfOperationsToMoveAllBallsToEachBox("110"));
        assertArrayEquals(new int[]{11,8,5,4,3,4}, LeetCodeAttempt.minimumNumberOfOperationsToMoveAllBallsToEachBox("001011"));

    }

}

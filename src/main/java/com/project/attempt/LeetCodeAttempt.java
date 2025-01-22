package com.project.attempt;

import java.util.Arrays;

public class LeetCodeAttempt {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(minimumNumberOfOperationsToMoveAllBallsToEachBox("110")));
        System.out.println(Arrays.toString(minimumNumberOfOperationsToMoveAllBallsToEachBox("001011")));

    }

    // This method will return an array of integers indicating the number of operations needed to move all balls
    // in the binary string boxes to each possible index (represented by the index positions in the array itself).
    public static int[] minimumNumberOfOperationsToMoveAllBallsToEachBox(String boxes) {

        // The array answer[] will contain our solution.
        // answer[0] will represent the number of operations needed to move all boxes to index 0.
        // answer[2] will represent the number of operations needed to move all boxes to index 2.
        // And so on and so forth.
        int[] answer = new int[boxes.length()];

        // We will do one main loop to go through each index in answer[].
        for (int i = 0; i < boxes.length(); i++) {

            // We start at 0 for that index.
            answer[i] = 0;

            // We will loop through all the elements on the left side of the index i.
            // For each '1' found, we calculate the difference between index i and index a (the
            // literal i and a values, not the values at index[i] and index[a]) to calculate the
            // number of operations needed to move the ball from index a to index i. And then we
            // increment answer[i] by that value, and continue this for each '1' found in this loop.
            for (int a = 0; a < i; a++) {

                answer[i] = answer[i] + (i - a) * (convertCharToInt(boxes.charAt(a)));

            }

            // We repeat the same loop for all the elements on the right side of index i.
            // The same logic basically applies here, except calculated a bit differently
            // since the value of b is going to larger than that of i.
            for (int b = i; b < boxes.length(); b++) {

                answer[i] = answer[i] + (b - i) * (convertCharToInt(boxes.charAt(b)));

            }

        }

        // Once we looped through both the left and right sides
        // for every index i of answer[], we return the answer[] array.
        return answer;

    }

    // A helper method to convert a char to its int counterpart.
    private static int convertCharToInt(char number) {

        return (number - '0');

    }

}

package com.project.solution;

import java.util.Arrays;

public class LeetCodeSolution {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(minOperations("110")));
        System.out.println(Arrays.toString(minOperations("001011")));

    }


    public static int[] minOperations(String boxes) {

        int[] answer = new int[boxes.length()];

        for (int currentBox = 0; currentBox < boxes.length(); currentBox++) {

            // If the current box contains a ball, calculate the number of moves for every box.
            if (boxes.charAt(currentBox) == '1') {

                for (int newPosition = 0; newPosition < boxes.length(); newPosition++) {
                    answer[newPosition] += Math.abs(newPosition - currentBox);
                }

            }

        }

        return answer;

    }

}

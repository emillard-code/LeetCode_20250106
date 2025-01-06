package com.project.attempt;

import java.util.Arrays;

public class LeetCodeAttempt {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(minimumNumberOfOperationsToMoveAllBallsToEachBox("110")));
        System.out.println(Arrays.toString(minimumNumberOfOperationsToMoveAllBallsToEachBox("001011")));

    }

    public static int[] minimumNumberOfOperationsToMoveAllBallsToEachBox(String boxes) {

        int[] answer = new int[boxes.length()];

        for (int i = 0; i < boxes.length(); i++) {

            answer[i] = 0;

            for (int a = 0; a < i; a++) {

                answer[i] = answer[i] + (i - a) * (convertCharToInt(boxes.charAt(a)));

            }

            for (int b = i; b < boxes.length(); b++) {

                answer[i] = answer[i] + (b - i) * (convertCharToInt(boxes.charAt(b)));

            }

        }

        return answer;

    }

    private static int convertCharToInt(char number) {

        return (number - '0');

    }

}

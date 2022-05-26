package com.inflearn.interview.bigo;

import java.util.Arrays;

public class TwoSumSolution {
    public static void main(String[] args) {
        TwoSumSolution twoSumSolution = new TwoSumSolution();
        System.out.println(Arrays.toString(twoSumSolution.solution1(new int[]{1, 2, 8, 9}, 9)));
    }

    /**
     * 시간 복잡도: O(n²)
     * 공간 복잡도: O(1)
     */
    private int[] solution1(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}

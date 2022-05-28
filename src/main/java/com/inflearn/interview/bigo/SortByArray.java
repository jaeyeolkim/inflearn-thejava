package com.inflearn.interview.bigo;

import java.util.Arrays;

public class SortByArray {

    public static void main(String[] args) {
        SortByArray sortByArray = new SortByArray();
        int[] sort = sortByArray.solution1(new int[]{1, 5, 3, 9, 2});
        System.out.println("sort = " + Arrays.toString(sort));
    }

    private int[] solution1(int[] numbers) {
        boolean[] booleans = new boolean[100];
        for (int number : numbers) {
            booleans[number] = true;
        }

        int index = 0;
        for (int i = 0; i < booleans.length; i++) {
            if (booleans[i]) {
                numbers[index++] = i;
            }
        }
        return numbers;
    }
}

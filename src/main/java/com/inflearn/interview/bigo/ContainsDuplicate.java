package com.inflearn.interview.bigo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static void main(String[] args) {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        System.out.println("solution1 = " + containsDuplicate.solution1(new int[]{1, 2, 2, 3}));
        System.out.println("solution1 = " + containsDuplicate.solution1(new int[]{1, 2, 3, 4}));
        System.out.println("solution2 = " + containsDuplicate.solution2(new int[]{1, 2, 2, 3}));
        System.out.println("solution2 = " + containsDuplicate.solution2(new int[]{1, 2, 3, 4}));
        System.out.println("solution3 = " + containsDuplicate.solution3(new int[]{1, 2, 2, 3}));
        System.out.println("solution3 = " + containsDuplicate.solution3(new int[]{1, 2, 3, 4}));
    }

    /**
     * 시간 복잡도: O(n²)
     * 공간 복잡도: O(1)
     */
    private boolean solution1(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 시간 복잡도: O(nlogn)
     * 공간 복잡도: O(logn)
     * 가급적 O(n²) 은 피하도록 하자.
     */
    private boolean solution2(int[] numbers) {
        Arrays.sort(numbers);

        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] == numbers[i + 1]) {
                return true;
            }
        }
        return false;
    }


    /**
     * 시간 복잡도: O(n)
     * 공간 복잡도: O(n)
     */
    private boolean solution3(int[] numbers) {
        Set<Integer> numberSet = new HashSet<>();
        for (int number: numbers) {
            if (numberSet.contains(number)) {
                return true;
            } else {
                numberSet.add(number);
            }
        }
        return false;
    }
}

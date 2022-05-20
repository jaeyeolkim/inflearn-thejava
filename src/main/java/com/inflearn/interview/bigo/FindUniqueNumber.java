package com.inflearn.interview.bigo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindUniqueNumber {

    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 2, 3, 3};
        FindUniqueNumber findUniqueNumber = new FindUniqueNumber();
        System.out.println("solution1 = " + findUniqueNumber.solution1(numbers));
        System.out.println("solution2 = " + findUniqueNumber.solution2(numbers));
        System.out.println("solution3 = " + findUniqueNumber.solution3(numbers));
    }

    /**
     * 시간 복잡도: O(n) * O(m) => O(n²)
     * 공간 복잡도: O(n)
     */
    private int solution1(int[] numbers) {
        List<Integer> list = new ArrayList<>();
        for (int number : numbers) {
            if (list.contains(number)) {
                list.remove((Integer) number);
            } else {
                list.add(number);
            }
        }
        return list.get(0);
    }

    /**
     * 시간 복잡도: O(n) + O(n) => O(2n) => O(n)
     * 공간 복잡도: O(n)
     */
    private int solution2(int[] numbers) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int number : numbers) {
            map.put(number, map.getOrDefault(number, 0) + 1);
        }
        for (int number : numbers) {
            if (map.get(number) == 1) {
                return number;
            }
        }
        return 0;
    }

    /**
     * 시간 복잡도: O(n)
     * 공간 복잡도: O(1)
     */
    private int solution3(int[] numbers) {
        int uniqueNum = 0;
        for (int number : numbers) {
            uniqueNum ^= number;
        }
        return uniqueNum;
    }
}

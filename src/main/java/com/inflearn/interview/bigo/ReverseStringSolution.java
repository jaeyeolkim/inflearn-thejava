package com.inflearn.interview.bigo;

public class ReverseStringSolution {
    public static void main(String[] args) {
        ReverseStringSolution reverseStringSolution = new ReverseStringSolution();
        System.out.println(reverseStringSolution.solution1(new char[]{'H', 'e', 'l', 'l', 'o'}));
        System.out.println(reverseStringSolution.solution2(new char[]{'H', 'e', 'l', 'l', 'o'}));
    }

    /**
     * 시간 복잡도: O(n)
     * 공간 복잡도: O(n)
     */
    private char[] solution1(char[] message) {
        char[] reverse = new char[message.length];
        for (int i = message.length - 1; i >= 0; i--) {
            reverse[reverse.length -1 - i] = message[i];
        }
        return reverse;
    }

    /**
     * 시간 복잡도: O(n)
     * 공간 복잡도: O(1)
     */
    private char[] solution2(char[] message) {
        for (int i = 0; i < message.length/2; i++) {
            char temp = message[i];
            message[i] = message[message.length - 1 - i];
            message[message.length - 1 - i] = temp;
        }
        return message;
    }
}

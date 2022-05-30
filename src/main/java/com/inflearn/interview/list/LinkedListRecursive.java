package com.inflearn.interview.list;

public class LinkedListRecursive {

    private LinkedNode head;
    private LinkedNode tail;

    public static void main(String[] args) {
        LinkedListRecursive linkedList = new LinkedListRecursive();
        linkedList.add(new LinkedNode(1));
        linkedList.add(new LinkedNode(2));
        linkedList.add(new LinkedNode(3));

        linkedList.print();
        linkedList.reverse();

        linkedList.print();
    }

    /**
     * 단일 연결 리스트를 뒤집는 함수 구현
     * 시간 복잡도: O(n)
     * 공간 복잡도: O(n)
     */
    private void reverse() {
        LinkedNode current = this.head;
        this.head = reverseRecursive(head);
        this.tail = head;
    }

    private LinkedNode reverseRecursive(LinkedNode node) {
        if (node == null || node.next == null) {
            return node;
        }

        LinkedNode newHead = reverseRecursive(node.next);
        node.next.next = node;
        node.next = null;

        return newHead;
    }

    private void print() {
        LinkedNode nodeToPrint = this.head;
        while (nodeToPrint != null) {
            System.out.println(nodeToPrint.number);
            nodeToPrint = nodeToPrint.next;
        }
    }

    private void add(LinkedNode node) {
        if (head == null) {
            head = node;
            tail = node;
        } else if (tail != null) {
            tail.next = node;
            tail = tail.next;
        }
    }

}

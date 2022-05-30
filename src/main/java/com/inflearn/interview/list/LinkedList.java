package com.inflearn.interview.list;

public class LinkedList {

    private LinkedNode head;
    private LinkedNode tail;

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
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
     * 공간 복잡도: O(1)
     */
    private void reverse() {
        LinkedNode current = this.head;
        LinkedNode prev = null;
        LinkedNode next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        this.tail = this.head;
        this.head = prev;
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

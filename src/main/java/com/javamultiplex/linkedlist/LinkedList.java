package com.javamultiplex.linkedlist;

public class LinkedList {

    private Node head;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }

    }

    public void insertEnd(int value) {
        Node node = new Node(value);
        if (isEmpty()) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;

        }
    }

    public void insertStart(int value) {
        Node node = new Node(value);
        if (isEmpty()) {
            head = node;
        } else {
            node.next = head;
            head = node;
        }
    }

    public void deleteEnd() {
        if (isEmpty()) {
            System.out.println("List is empty.");
        } else if (head.next == null) {
            head = null;
        } else {
            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
        }

    }

    public void deleteStart() {
        if (isEmpty()) {
            System.out.println("List is empty.");
        } else {
            head = head.next;
        }
    }

    public int size() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    //LinkedList starts from 0.
    public void insertAt(int position, int value) {
        if (position == 0) {
            insertStart(value);
        } else if (position == size()) {
            insertEnd(value);
        } else if (position > 0 && position < size()) {
            insertAtMiddle(position, value);
        } else {
            System.out.println("Invalid position.");
        }

    }

    public void insertAtMiddle(int position, int value) {
        Node node = new Node(value);
        Node temp1 = head;
        Node temp2 = null;
        int count = 0;
        while (count < position) {
            temp2 = temp1;
            temp1 = temp1.next;
            count++;
        }
        temp2.next = node;
        node.next = temp1;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void traverse() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
    }
}

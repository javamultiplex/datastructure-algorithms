package com.javamultiplex.linkedlist;

/**
 * @author Rohit Agarwal on 2019-07-06
 */
public class CircularLinkedList {

    private Node head;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
            this.next = this;
        }
    }

    public void insertEnd(int value) {
        Node node = new Node(value);
        if (isEmpty()) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = node;
            node.next = head;
        }
    }

    public void insertStart(int value){
        Node node=new Node(value);
        if(isEmpty()){
            head=node;
        }else{
            Node temp=head;
            while (temp.next!=head) {
                temp = temp.next;
            }
            node.next=head;
            temp.next=node;
            head=node;
        }
    }

    public void clear(){
        head=null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void traverse() {
        Node temp = head;
        while (temp.next != head) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.print(temp.value);
    }

    public int size(){
        if(isEmpty()){
            return 0;
        }else {
            int count = 1;
            Node temp = head;
            while (temp.next != head) {
                count++;
                temp = temp.next;
            }
            return count;
        }
    }
}

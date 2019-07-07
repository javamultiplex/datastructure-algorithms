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

    /**
     *
     * @param value
     */
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

    /**
     *
     * @param value
     */
    public void insertStart(int value) {
        Node node = new Node(value);
        if (isEmpty()) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            node.next = head;
            temp.next = node;
            head = node;
        }
    }

    /**
     *
     * @param position
     * @param value
     */
    public void insertMiddle(int position, int value){
        Node node=new Node(value);
        Node temp1=null,temp2=head;
        int count=0;
        while (count<position){
            count++;
            temp1=temp2;
            temp2=temp2.next;
        }
        temp1.next=node;
        node.next=temp2;
    }

    /**
     *
     * @param position
     * @param value
     */
    public void insertAt(int position, int value){
        if(position==0){
            insertStart(value);
        }else if(position==size()){
            insertEnd(value);
        }else if(position>0 && position<size()){
            insertMiddle(position,value);
        }else{
            System.out.println("Invalid position.");
        }
    }


    public void deleteStart() {
        if (isEmpty()) {
            System.out.println("List is empty");
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            head = head.next;
            temp.next = head;
        }
    }


    public void deleteEnd() {
        if (isEmpty()) {
            System.out.println("List is empty");
        } else if (head.next == head) {
            head = null;
        }else{
            Node temp1=null, temp2=head;
            while (temp2.next!=head){
                temp1=temp2;
                temp2=temp2.next;
            }
            temp1.next=head;
        }
    }

    /**
     *
     * @param position
     */
    public void deleteMiddle(int position){
        int count=0;
        Node temp1=null, temp2=head;
        while (count<position){
            count++;
            temp1=temp2;
            temp2=temp2.next;
        }
        temp1.next=temp2.next;
    }

    /**
     *
     * @param position
     */
    public void deleteAt(int position){
        if(position==0){
            deleteStart();
        }else if(position==size()-1){
            deleteEnd();
        }else if(position>0 && position<size()-1){
            deleteMiddle(position);
        }else{
            System.out.println("Invalid position.");
        }
    }

    public void clear() {
        head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void traverse() {
        if (isEmpty()) {
            System.out.println("List is empty");
        } else {
            Node temp = head;
            while (temp.next != head) {
                System.out.print(temp.value + "->");
                temp = temp.next;
            }
            System.out.print(temp.value);
        }
    }

    public int size() {
        if (isEmpty()) {
            return 0;
        } else {
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

package com.javamultiplex.linkedlist;


/**
 * @author Rohit Agarwal on 2019-07-03
 */
public class SingleLinkedList {

    private Node head;

    private class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
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
            node.next = head;
            head = node;
        }
    }

    /**
     *
     * @param position
     * @param value
     */
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
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;

        }
    }

    public void deleteStart() {
        if (isEmpty()) {
            System.out.println("List is empty.");
        } else {
            head = head.next;
        }
    }

    /**
     *
     * @param position
     */
    private void deleteMiddle(int position){
        Node temp1=null,temp2=head;
        int count=0;
        while(count<position){
            temp1=temp2;
            temp2=temp2.next;
            count++;
        }
        temp1.next=temp2.next;
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



    public int size() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }


    /**
     *
     * @param position
     * @param value
     */
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

    /**
     *
     * @param position
     */
    public void deleteAt(int position){
        if(position==0){
            deleteStart();
        }else if(position==size()-1){
            deleteEnd();
        }else if(position>0&&position<size()-1){
            deleteMiddle(position);
        }else{
            System.out.println("Invalid position");
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
        while (temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
    }
}

package com.javamultiplex.linkedlist;

/**
 * @author Rohit Agarwal on 2019-07-03
 */
public class DoubleLinkedList {

    private Node head;

    private class Node{
        int value;
        Node next;
        Node prev;

        public Node(int value) {
            this.value = value;
            this.next=null;
            this.prev=null;
        }

    }

    public void insertEnd(int value){
        Node node=new Node(value);
        if(isEmpty()){
            head=node;
        }else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=node;
            node.prev=temp;
        }
    }


    public void insertStart(int value){
        Node node=new Node(value);
        if(isEmpty()){
            head=node;
        }else{
            node.next=head;
            head.prev=node;
            head=node;
        }
    }

    public void insertMiddle(int position, int value){
        Node temp1=null, temp2=head;
        Node node=new Node(value);
        int count=0;
        while (count<position){
            temp1=temp2;
            temp2=temp2.next;
            count++;
        }
        node.next=temp2;
        temp1.next=node;
        temp2.prev=node;
        node.prev=temp1;

    }

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


    public void clear(){
        head=null;
    }

    public void deleteStart(){
        if(isEmpty()){
            System.out.println("List is empty.");
        }else{
            head=head.next;
            head.prev=null;
        }
    }

    public void deleteEnd(){
      if(isEmpty()){
          System.out.println("List is empty.");
      }else if(head.next==null){
          head=null;
      }else{
          Node temp1=null,temp2=head;
          while (temp2.next!=null){
              temp1=temp2;
              temp2=temp2.next;
          }
          temp1.next=null;
          temp2.prev=null;
      }
    }

    private void deleteMiddle(int position){
        int count=0;
        Node temp1=null,temp2=head;
        while (count<position){
            count++;
            temp1=temp2;
            temp2=temp2.next;
        }
        temp1.next=temp2.next;
        temp2.next.prev=temp2.prev;

    }

    public void deleteAt(int position){
        if(position==0){
            deleteStart();
        }else if(position==size()-1){
            deleteEnd();
        }else if(position>0 && position<size()-1){
            deleteMiddle(position);
        }else{
            System.out.println("Invalid Position.");
        }
    }

    public void traverse(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
    }

    public int size(){
        int count=0;
        Node temp=head;
        while (temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }

    public boolean isEmpty(){
        return head==null;
    }
}

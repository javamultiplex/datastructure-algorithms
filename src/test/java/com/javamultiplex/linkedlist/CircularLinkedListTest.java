package com.javamultiplex.linkedlist;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Rohit Agarwal on 2019-07-06
 */
public class CircularLinkedListTest {

    private CircularLinkedList circularLinkedList;

    @Before
    public void setUp(){
        circularLinkedList=new CircularLinkedList();
    }

    @Test
    public void insertAtEnd(){
        circularLinkedList.insertEnd(10);
        circularLinkedList.insertEnd(20);
        circularLinkedList.insertEnd(30);
        circularLinkedList.insertEnd(40);
        circularLinkedList.traverse();
    }

    @Test
    public void insertAtStart(){
        circularLinkedList.insertStart(10);
        circularLinkedList.insertStart(20);
        circularLinkedList.insertStart(30);
        circularLinkedList.insertStart(40);
        circularLinkedList.insertEnd(50);
        circularLinkedList.traverse();
    }

    @Test
    public void clear(){
        circularLinkedList.insertStart(10);
        circularLinkedList.insertStart(20);
        circularLinkedList.insertStart(30);
        circularLinkedList.insertStart(40);
        circularLinkedList.insertEnd(50);
        circularLinkedList.traverse();
        Assert.assertEquals(5,circularLinkedList.size());
        circularLinkedList.clear();
        Assert.assertEquals(0,circularLinkedList.size());


    }
}

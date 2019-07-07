package com.javamultiplex.linkedlist;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author Rohit Agarwal on 2019-07-06
 */
public class CircularLinkedListTest {

    private CircularLinkedList circularLinkedList;

    @Before
    public void setUp() {
        circularLinkedList = new CircularLinkedList();
    }

    @Test
    public void insertAtEnd() {
        circularLinkedList.insertEnd(10);
        circularLinkedList.insertEnd(20);
        circularLinkedList.insertEnd(30);
        circularLinkedList.insertEnd(40);
        circularLinkedList.traverse();
    }

    @Test
    public void insertAtStart() {
        circularLinkedList.insertStart(10);
        circularLinkedList.insertStart(20);
        circularLinkedList.insertStart(30);
        circularLinkedList.insertStart(40);
        circularLinkedList.insertEnd(50);
        circularLinkedList.traverse();
    }

    @Test
    public void clear() {
        circularLinkedList.insertStart(10);
        circularLinkedList.insertStart(20);
        circularLinkedList.insertStart(30);
        circularLinkedList.insertStart(40);
        circularLinkedList.insertEnd(50);
        circularLinkedList.traverse();
        assertEquals(5, circularLinkedList.size());
        circularLinkedList.clear();
        assertEquals(0, circularLinkedList.size());
    }

    @Test
    public void deleteStart() {
        circularLinkedList.insertStart(10);
        circularLinkedList.insertStart(20);
        circularLinkedList.insertStart(30);
        circularLinkedList.insertStart(40);
        circularLinkedList.traverse();
        assertEquals(4, circularLinkedList.size());
        System.out.println();
        circularLinkedList.deleteStart();
        circularLinkedList.traverse();
        assertEquals(3, circularLinkedList.size());
        System.out.println();
        circularLinkedList.deleteStart();
        circularLinkedList.traverse();
        assertEquals(2, circularLinkedList.size());
    }

    @Test
    public void deleteEnd() {
        circularLinkedList.insertEnd(10);
        circularLinkedList.insertEnd(20);
        circularLinkedList.insertStart(30);
        circularLinkedList.traverse();
        System.out.println();
        circularLinkedList.deleteEnd();
        circularLinkedList.traverse();
        assertEquals(2, circularLinkedList.size());
        System.out.println();
        circularLinkedList.deleteEnd();
        circularLinkedList.traverse();
        assertEquals(1, circularLinkedList.size());
        System.out.println();
        circularLinkedList.deleteEnd();
        circularLinkedList.traverse();
        assertEquals(0, circularLinkedList.size());
    }

    @Test
    public void insertAt() {
        circularLinkedList.insertAt(0, 10);
        circularLinkedList.insertAt(0, 20);
        circularLinkedList.insertAt(0, 30);
        circularLinkedList.insertAt(3, 40);
        circularLinkedList.insertAt(4, 50);
        circularLinkedList.traverse();
        System.out.println();
        assertEquals(5, circularLinkedList.size());
        circularLinkedList.insertAt(3, 90);
        circularLinkedList.traverse();
        System.out.println();
        assertEquals(6, circularLinkedList.size());
        circularLinkedList.insertAt(2, 70);
        circularLinkedList.traverse();
        System.out.println();
        assertEquals(7, circularLinkedList.size());
        circularLinkedList.insertAt(0, 99);
        circularLinkedList.traverse();
        System.out.println();
        circularLinkedList.insertAt(11,9);
        circularLinkedList.traverse();
    }

    @Test
    public void deleteAt(){
        circularLinkedList.insertEnd(10);
        circularLinkedList.insertEnd(20);
        circularLinkedList.insertEnd(30);
        circularLinkedList.insertEnd(40);
        circularLinkedList.insertEnd(50);
        circularLinkedList.insertEnd(80);
        circularLinkedList.traverse();
        System.out.println();
        circularLinkedList.deleteAt(0);
        circularLinkedList.traverse();
        System.out.println();
        circularLinkedList.deleteAt(3);
        circularLinkedList.traverse();
        System.out.println();
        circularLinkedList.deleteAt(1);
        circularLinkedList.traverse();
        System.out.println();
        circularLinkedList.deleteAt(2);
        circularLinkedList.traverse();
    }
}

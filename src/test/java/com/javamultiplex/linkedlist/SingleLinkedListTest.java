package com.javamultiplex.linkedlist;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SingleLinkedListTest {

    private SingleLinkedList singleLinkedList;

    @Before
    public void setUp() {
        singleLinkedList = new SingleLinkedList();
    }

    @Test
    public void shouldReturnTrueIfLinkedListIsEmpty() {
        assertTrue(singleLinkedList.isEmpty());
    }

    @Test
    public void shouldInsertElementAtTheEnd() {
        singleLinkedList.insertEnd(12);
        singleLinkedList.insertEnd(19);
        assertEquals(2, singleLinkedList.size());
        assertFalse(singleLinkedList.isEmpty());
        singleLinkedList.insertEnd(71);
        assertEquals(3, singleLinkedList.size());
        singleLinkedList.deleteEnd();
        singleLinkedList.deleteEnd();
        assertEquals(1, singleLinkedList.size());
        singleLinkedList.deleteStart();
        assertEquals(0, singleLinkedList.size());
        assertTrue(singleLinkedList.isEmpty());
    }

    @Test
    public void shouldTraverseLinkedList() {
        singleLinkedList.insertStart(10);
        singleLinkedList.insertStart(20);
        singleLinkedList.insertEnd(30);
        assertFalse(singleLinkedList.isEmpty());
        assertEquals(3, singleLinkedList.size());
        singleLinkedList.traverse();
    }

    @Test
    public void shouldInsertAtSpecificPosition() {
        singleLinkedList.insertAt(0, 7);
        singleLinkedList.insertAt(0, 9);
        singleLinkedList.insertAt(2, 8);
        singleLinkedList.insertAt(3, 80);
        singleLinkedList.insertAt(2, 6);
        singleLinkedList.insertAt(3,66);
        singleLinkedList.traverse();
    }

    @Test
    public void deleteAtSpecificPosition(){
        singleLinkedList.insertAt(0, 7);
        singleLinkedList.insertAt(0, 9);
        singleLinkedList.insertAt(2, 8);
        singleLinkedList.insertAt(3, 80);
        singleLinkedList.insertAt(2, 6);
        singleLinkedList.insertAt(3,66);
        singleLinkedList.traverse();
        singleLinkedList.deleteAt(0);
        System.out.println();
        singleLinkedList.traverse();
        singleLinkedList.deleteAt(2);
        System.out.println();
        singleLinkedList.traverse();
        singleLinkedList.deleteAt(singleLinkedList.size()-1);
        System.out.println();
        singleLinkedList.traverse();
        singleLinkedList.deleteAt(1);
        System.out.println();
        singleLinkedList.traverse();
        singleLinkedList.deleteAt(1);
        System.out.println();
        singleLinkedList.traverse();
    }

    @Test
    public void shouldClearLinkedList(){
        singleLinkedList.insertAt(0, 7);
        singleLinkedList.insertAt(0, 9);
        singleLinkedList.insertAt(2, 8);
        singleLinkedList.insertAt(3, 80);
        singleLinkedList.insertAt(2, 6);
        singleLinkedList.insertAt(3,66);
        singleLinkedList.traverse();
        singleLinkedList.clear();
        System.out.println("\nAfter clearing singleLinkedList");
        singleLinkedList.traverse();
    }

}

package com.javamultiplex.linkedlist;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {

    private LinkedList linkedList;

    @Before
    public void setUp() {
        linkedList = new LinkedList();
    }

    @Test
    public void shouldReturnTrueIfLinkedListIsEmpty() {
        assertTrue(linkedList.isEmpty());
    }

    @Test
    public void shouldInsertElementAtTheEnd() {
        linkedList.insertEnd(12);
        linkedList.insertEnd(19);
        assertEquals(2, linkedList.size());
        assertFalse(linkedList.isEmpty());
        linkedList.insertEnd(71);
        assertEquals(3, linkedList.size());
        linkedList.deleteEnd();
        linkedList.deleteEnd();
        assertEquals(1, linkedList.size());
        linkedList.deleteStart();
        assertEquals(0, linkedList.size());
        assertTrue(linkedList.isEmpty());
    }

    @Test
    public void shouldTraverseLinkedList() {
        linkedList.insertStart(10);
        linkedList.insertStart(20);
        linkedList.insertEnd(30);
        assertFalse(linkedList.isEmpty());
        assertEquals(3, linkedList.size());
        linkedList.traverse();
    }

    @Test
    public void shouldInsertAtSpecificPosition() {
        linkedList.insertAt(0, 7);
        linkedList.insertAt(0, 9);
        linkedList.insertAt(2, 8);
        linkedList.insertAt(3, 80);
        linkedList.insertAt(2, 6);
        linkedList.insertAt(3,66);
        linkedList.traverse();
    }
}

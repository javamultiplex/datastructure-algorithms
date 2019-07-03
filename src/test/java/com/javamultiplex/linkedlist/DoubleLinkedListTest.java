package com.javamultiplex.linkedlist;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DoubleLinkedListTest {

    private DoubleLinkedList doubleLinkedList;

    @Before
    public void setUp() throws Exception {
        doubleLinkedList = new DoubleLinkedList();
    }

    @Test
    public void shouldInsertElementAtEnd() {
        assertTrue(doubleLinkedList.isEmpty());
        assertEquals(0, doubleLinkedList.size());
        doubleLinkedList.insertEnd(10);
        doubleLinkedList.insertEnd(30);
        doubleLinkedList.insertEnd(40);
        doubleLinkedList.insertEnd(50);
        doubleLinkedList.traverse();
        assertFalse(doubleLinkedList.isEmpty());
        assertEquals(4, doubleLinkedList.size());
    }

    @Test
    public void shouldInsertElementAtStart() {
        assertTrue(doubleLinkedList.isEmpty());
        assertEquals(0, doubleLinkedList.size());
        doubleLinkedList.insertStart(10);
        doubleLinkedList.insertStart(20);
        doubleLinkedList.insertEnd(30);
        doubleLinkedList.insertStart(40);
        doubleLinkedList.insertEnd(90);
        doubleLinkedList.insertEnd(70);
        doubleLinkedList.insertStart(50);
        doubleLinkedList.traverse();
        assertFalse(doubleLinkedList.isEmpty());
        assertEquals(7, doubleLinkedList.size());
    }

    @Test
    public void shouldInsertElementAtSpecificPosition(){
        doubleLinkedList.insertAt(0,10);
        doubleLinkedList.insertAt(0,20);
        doubleLinkedList.insertAt(doubleLinkedList.size(),80);
        doubleLinkedList.insertAt(doubleLinkedList.size(),90);
        doubleLinkedList.insertAt(0,70);
        doubleLinkedList.insertAt(1,99);
        doubleLinkedList.insertAt(1,97);
        doubleLinkedList.insertAt(6,94);
        doubleLinkedList.traverse();
    }

    @Test
    public void shouldClearList(){
        doubleLinkedList.insertAt(0,10);
        doubleLinkedList.insertAt(0,20);
        doubleLinkedList.insertAt(doubleLinkedList.size(),80);
        doubleLinkedList.insertAt(doubleLinkedList.size(),90);
        doubleLinkedList.insertAt(0,70);
        doubleLinkedList.insertAt(1,99);
        doubleLinkedList.insertAt(1,97);
        doubleLinkedList.insertAt(6,94);
        assertFalse(doubleLinkedList.isEmpty());
        doubleLinkedList.traverse();
        doubleLinkedList.clear();
        assertTrue(doubleLinkedList.isEmpty());
    }


    @Test
    public void shouldDeleteStartingElement(){
        doubleLinkedList.insertAt(0,10);
        doubleLinkedList.insertAt(0,20);
        doubleLinkedList.insertAt(doubleLinkedList.size(),80);
        doubleLinkedList.insertAt(doubleLinkedList.size(),90);
        doubleLinkedList.insertAt(0,70);
        doubleLinkedList.insertAt(1,99);
        doubleLinkedList.insertAt(1,97);
        doubleLinkedList.insertAt(6,94);
        assertFalse(doubleLinkedList.isEmpty());
        doubleLinkedList.traverse();
        doubleLinkedList.deleteStart();
        System.out.println();
        doubleLinkedList.traverse();
        doubleLinkedList.deleteStart();
        System.out.println();
        doubleLinkedList.traverse();
    }

    @Test
    public void shouldDeleteLastElement(){
        doubleLinkedList.insertAt(0,10);
        doubleLinkedList.insertAt(0,20);
        doubleLinkedList.insertAt(doubleLinkedList.size(),80);
        doubleLinkedList.insertAt(doubleLinkedList.size(),90);
        doubleLinkedList.insertAt(0,70);
        doubleLinkedList.insertAt(1,99);
        doubleLinkedList.insertAt(1,97);
        doubleLinkedList.insertAt(6,94);
        assertFalse(doubleLinkedList.isEmpty());
        doubleLinkedList.traverse();
        doubleLinkedList.deleteEnd();
        System.out.println();
        doubleLinkedList.traverse();
        doubleLinkedList.deleteStart();
        System.out.println();
        doubleLinkedList.traverse();
    }

    @Test
    public void shouldDeleteElementFromSpecificLocation(){
        doubleLinkedList.insertAt(0,10);
        doubleLinkedList.insertAt(0,20);
        doubleLinkedList.insertAt(doubleLinkedList.size(),80);
        doubleLinkedList.insertAt(doubleLinkedList.size(),90);
        doubleLinkedList.insertAt(0,70);
        doubleLinkedList.insertAt(1,99);
        doubleLinkedList.insertAt(1,97);
        doubleLinkedList.insertAt(6,94);
        assertFalse(doubleLinkedList.isEmpty());
        doubleLinkedList.traverse();
        doubleLinkedList.deleteAt(0);
        System.out.println();
        doubleLinkedList.traverse();
        doubleLinkedList.deleteAt(0);
        System.out.println();
        doubleLinkedList.traverse();
        doubleLinkedList.deleteAt(5);
        System.out.println();
        doubleLinkedList.traverse();
        doubleLinkedList.deleteAt(1);
        System.out.println();
        doubleLinkedList.traverse();
        doubleLinkedList.deleteAt(2);
        System.out.println();
        doubleLinkedList.traverse();
        doubleLinkedList.deleteAt(1);
        System.out.println();
        doubleLinkedList.traverse();
    }


}

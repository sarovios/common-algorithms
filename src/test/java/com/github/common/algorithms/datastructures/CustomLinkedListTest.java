package com.github.common.algorithms.datastructures;

import org.junit.Test;

import static org.junit.Assert.*;

public class CustomLinkedListTest {

    CustomLinkedList<Integer> linkedList = new CustomLinkedList<Integer>();

    @Test
    public void addFirstTest() {
        linkedList.addFirst(10);
        assertEquals("[ 10 ]", linkedList.toString());
        linkedList.addFirst(15);
        linkedList.addFirst(20);
        linkedList.addFirst(50);
        assertEquals("[ 50 20 15 10 ]", linkedList.toString());
    }

    @Test
    public void getFirstTest() {
        linkedList.addFirst(5);
        linkedList.addLast(10);
        linkedList.addLast(15);
        assertEquals(5, linkedList.getFirst().intValue());
    }

    @Test
    public void addLastTest() {
        linkedList.addFirst(5);
        linkedList.addLast(10);
        linkedList.addLast(15);
        assertEquals("[ 5 10 15 ]", linkedList.toString());
        linkedList.addLast(50);
        linkedList.addLast(60);
        linkedList.addLast(70);
        assertEquals("[ 5 10 15 50 60 70 ]", linkedList.toString());
    }

    @Test
    public void getLastTest() {
        linkedList.addFirst(5);
        linkedList.addLast(10);
        linkedList.addLast(15);
        assertEquals(15, linkedList.getLast().intValue());
    }

    @Test
    public void isEmptyTest() {
        assertEquals(true, linkedList.isEmpty());
        linkedList.addFirst(5);
        linkedList.addLast(10);
        linkedList.addLast(15);
        assertEquals(false, linkedList.isEmpty());
    }

    @Test
    public void clearTest() {
        linkedList.addFirst(5);
        linkedList.addLast(10);
        linkedList.addLast(15);
        assertEquals(false, linkedList.isEmpty());
        linkedList.clear();
        assertEquals(true, linkedList.isEmpty());
    }

    @Test
    public void insertAfterTest() {
        linkedList.addFirst(5);
        linkedList.addLast(10);
        linkedList.addLast(15);
        linkedList.addLast(25);
        assertEquals("[ 5 10 15 25 ]", linkedList.toString());
        linkedList.insertAfter(15, 20);
        assertEquals("[ 5 10 15 20 25 ]", linkedList.toString());
        linkedList.insertAfter(25, 30);
        assertEquals("[ 5 10 15 20 25 30 ]", linkedList.toString());
    }

    @Test
    public void insertBeforeTest() {
        linkedList.addFirst(5);
        linkedList.addLast(10);
        linkedList.addLast(15);
        linkedList.addLast(25);
        assertEquals("[ 5 10 15 25 ]", linkedList.toString());
        linkedList.insertBefore(15, 20);
        assertEquals("[ 5 10 20 15 25 ]", linkedList.toString());
        linkedList.insertBefore(25, 30);
        assertEquals("[ 5 10 20 15 30 25 ]", linkedList.toString());
    }
}

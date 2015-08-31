package com.github.common.algorithms.datastructures;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomLinkedListTest {

    CustomLinkedList<Integer> linkedList = new CustomLinkedList<Integer>();

    @Test
    public void addFirstTest() {
        linkedList.addFirst(10);
        assertEquals("[ 10 ]", linkedList.toString());
    }

    @Test
    public void addLastTest() {
        linkedList.addFirst(5);
        linkedList.addLast(10);
        linkedList.addLast(15);
        assertEquals("[ 5 10 15 ]", linkedList.toString());
    }

    @Test
    public void isEmptyTest() {
        assertEquals(true, linkedList.isEmpty());
    }
}

package com.github.common.algorithms.sorting;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BubbleSortTest {

    private BubbleSort bubbleSort;

    @Before
    public void setUp() {
        this.bubbleSort = new BubbleSort();
    }

    @Test(expected = NullPointerException.class)
    public void testBubbleSortNullArray() {
        int[] array = null;
        bubbleSort.sort(array);
    }

    @Test
    public void testBubbleSortOneValueArray() {
        int[] array = {2};
        int[] expected = {2};
        bubbleSort.sort(array);
        assertArrayEquals(expected, array);
    }
    @Test
    public void testBubbleSortZeroValuesArray() {
        int[] array = {};
        int[] expected = {};
        bubbleSort.sort(array);
        assertArrayEquals(expected, array);
    }
    @Test
    public void testBubbleSortOddArray() {
        int[] array = {2, 4, 1, 6, 8, 5, 3, 7, 15};
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 15};
        bubbleSort.sort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void testBubbleSortEvenArray() {
        int[] array = {2, 4, 1, 6, 8, 5, 3, 7};
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8};
        bubbleSort.sort(array);
        assertArrayEquals(expected, array);
    }

}

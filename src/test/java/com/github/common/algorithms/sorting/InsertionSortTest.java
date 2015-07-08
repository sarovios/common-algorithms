package com.github.common.algorithms.sorting;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class InsertionSortTest {

    InsertionSort insertionSort;

    @Before
    public void setUp() {
        insertionSort = new InsertionSort();
    }

    @Test(expected = NullPointerException.class)
    public void testInsertionSortNullArray() {
        int[] array = null;
        insertionSort.sort(array);
    }
    @Test
    public void testInsertionSortZeroValuesArray() {
        int[] array = {};
        int[] expected = {};
        insertionSort.sort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void testInsertionSortOneValueArray() {
        int[] array = {2};
        int[] expected = {2};
        insertionSort.sort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void testInsertionSortOddArray() {
        int[] array = {2, 4, 1, 6, 8, 5, 15, 3, 7};
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 15};
        insertionSort.sort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void testInsertionSortEvenArray() {
        int[] array = {2, 4, 1, 6, 8, 5, 3, 7};
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8};
        insertionSort.sort(array);
        assertArrayEquals(expected, array);
    }
}

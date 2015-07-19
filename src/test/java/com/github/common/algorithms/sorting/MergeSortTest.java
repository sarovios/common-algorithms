package com.github.common.algorithms.sorting;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

//TODO: add test cases to merge function
//TODO: add test case with big array
public class MergeSortTest {

    MergeSort mergeSort;

    @Before
    public void setUp() {
        mergeSort = new MergeSort();
    }

    @Test (expected = NullPointerException.class)
    public void testMergeSortNullArray() {
        int[] array = null;
        mergeSort.sort(array);
    }

    @Test
    public void testMergeSortZeroValuesArray() {
        int[] array = {};
        int[] expected = {};
        mergeSort.sort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void testMergerSortOneValueArray() {
        int[] array = {2};
        int[] expected = {2};
        mergeSort.sort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void testMergeSortEvenSizeArray() {
        int[] array = {2, 4, 1, 6, 8, 5, 3, 7};
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8};
        mergeSort.sort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void testMergeSortOddSizeArray() {
        int[] array = {2, 4, 1, 6, 8, 5, 3, 7, 15};
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 15};
        mergeSort.sort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void testMergeSortEvenSizeWithDuplicatesArray() {
        int[] array = {2, 4, 1, 6, 8, 5, 3, 7, 15, 4};
        int[] expected = {1, 2, 3, 4, 4, 5, 6, 7, 8, 15};
        mergeSort.sort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void testMergeSortOddSizeWithDuplicatesArray() {
        int[] array = {2, 4, 1, 6, 8, 5, 3, 7, 4};
        int[] expected = {1, 2, 3, 4, 4, 5, 6, 7, 8};
        mergeSort.sort(array);
        assertArrayEquals(expected, array);
    }

}

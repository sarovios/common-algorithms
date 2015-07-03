package com.github.common.algorithms.sorting;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MergeSortTest {

    private MergeSort mergeSort;

//    @Before
//    public void setUp() {
//        this.mergeSort = new MergeSort();
//    }
//
//    @Test
//    public void testMergeEvenSizeArrays() {
//        int[] arr1 ={1, 2, 4, 6};
//        int[] arr2 = {3, 5, 7, 8};
//        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8};
//        assertArrayEquals(expected, mergeSort.merge(arr1, arr2, 8));
//    }
//
//    @Test
//    public void testMergeOddSizeArrays() {
//        int[] arr1 ={1, 2, 4, 6};
//        int[] arr2 = {3, 5, 7, 8, 10, 15, 50};
//        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 10, 15, 50};
//        assertArrayEquals(expected, mergeSort.merge(arr1, arr2, 11));
//    }

    @Test
    public void testMergeSortEvenSizeArray() {
        int[] array = {2, 4, 1, 6, 8, 5, 3, 7};
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8};
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(array);
        assertArrayEquals(expected, array);
    }
}

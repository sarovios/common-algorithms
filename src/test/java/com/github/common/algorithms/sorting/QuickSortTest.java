package com.github.common.algorithms.sorting;

import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static org.junit.Assert.assertArrayEquals;

public class QuickSortTest {

    QuickSort quickSort;

    @Before
    public void setUp() {
        quickSort = new QuickSort();
    }

    @Test (expected = NullPointerException.class)
    public void testQuickSortNullArray() {
        int[] array = null;
        quickSort.sort(array);
    }

    @Test
    public void testQuickSortZeroValuesArray() {
        int[] array = {};
        int[] expected = {};
        quickSort.sort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void testQuickSortOneValueArray() {
        int[] array = {2};
        int[] expected = {2};
        quickSort.sort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void testQuickSortEvenSizeArray() {
        int[] array = {2, 4, 1, 6, 8, 5, 3, 7};
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8};
        quickSort.sort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void testQuickSortOddSizeArray() {
        int[] array = {2, 4, 1, 6, 8, 5, 3, 7, 15};
        int[] expected = {1, 2, 3, 4, 5, 6, 7, 8, 15};
        quickSort.sort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void testQuickSortEvenSizeWithDuplicatesArray() {
        int[] array = {2, 4, 1, 6, 8, 5, 3, 7, 15, 4};
        int[] expected = {1, 2, 3, 4, 4, 5, 6, 7, 8, 15};
        quickSort.sort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void testQuickSortOddSizeWithDuplicatesArray() {
        int[] array = {2, 4, 1, 6, 8, 5, 3, 7, 4};
        int[] expected = {1, 2, 3, 4, 4, 5, 6, 7, 8};
        quickSort.sort(array);
        assertArrayEquals(expected, array);
    }

    @Test
    public void testQuickSortBigArray() {
        int[] array = new int[10000];
        int[] expected = new int[10000];
        int i = 0;
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("comparisons.txt").getFile());
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                int val =  scanner.nextInt();
                array[i++] = val;
                expected[i-1] = i;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        quickSort.sort(array);
        assertArrayEquals(expected, array);
    }
}

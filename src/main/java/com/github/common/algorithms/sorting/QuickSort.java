package com.github.common.algorithms.sorting;

import java.util.Random;

public class QuickSort {

    private int[] array;
    private int length;

    public void sort(int[] array) {
        if (array == null) throw new NullPointerException("Array value cannot be null");
        this.array = array;
        this.length = array.length;
        if (length == 1) return;
        quickSort(0, length);
    }

    private void quickSort(int start, int end) {
        if (start < end) {
            int p = findPivot(start, end);
            int newP = partition(p, start, end);
            quickSort(0, newP-1);
            quickSort(newP+1, end);
        }
    }

    private int partition(int pivot, int start, int end) {
        int pValue = array[pivot];
        int i = start + 1, j = start + 1;
        while (j < end) {
            if (pValue > array[j]) {
                swap(i, j);
                i++;
            }
            j++;
        }
        swap(pivot, i-1);
        return i-1;
    }

    private void swap(int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    private int findPivot(int start, int end) {
        int pIndex = new Random().nextInt(end - start) + start;
        if (pIndex != start) swap(pIndex, start);
        return start;
    }

}

package com.github.common.algorithms.sorting;

import java.util.Random;

public class QuickSort {

    private int[] array;
    private int length;

    private int comparisons;

    public void sort(int[] array) {
        if (array == null) throw new NullPointerException("Array value cannot be null");
        this.array = array;
        this.length = array.length;
        if (length == 1) return;
        quickSort(0, length-1);
    }

    private void quickSort(int start, int end) {
        if (start < end) {
            comparisons = comparisons + (end - start);
            int p = findPivot(start, end);
            int newP = partition(p, start, end);
            quickSort(start, newP-1);
            quickSort(newP+1, end);
        }
    }

    public int getComparisons() {
        return this.comparisons;
    }

    private int partition(int pivot, int start, int end) {
        int pValue = array[pivot];
        int i = start + 1, j = start + 1;
        while (j <= end) {
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
        int middle = (end - start) / 2 + start;
        int median = findMedian(start, middle, end);
        if (median != start) swap(median, start);
//        int pIndex = new Random().nextInt(end - start) + start;
//        if (pIndex != start) swap(pIndex, start);
//        swap(end, start);
        return start;
    }

    private int findMedian(int s, int m, int e) {
        int start = array[s];
        int middle = array[m];
        int end = array[e];
        if ( (start >= middle) && (start <= end) ) return s;
        if ( (start >= end) && (start <= middle) ) return s;
        if ( (middle >= start) && (middle <= end) ) return m;
        if ( (middle >= end) && (middle <= start) ) return m;
        if ( (end >= start) && (end <= middle) ) return e;
        if ( (end >= middle) && (end <= start) ) return e;
        return -1;
    }

}

package com.github.common.algorithms.sorting;

public class InsertionSort {

    public int[] array;
    private int length;

    public void sort(int[] array) {
        if (array == null) throw new NullPointerException("Array value cannot be null");
        this.array = array;
        this.length = array.length;
        insertionSort();
    }

    private void insertionSort() {
        for (int i = 0; i < length; i++) {
            insert(i);
        }
    }

    public void insert(int i) {
        int value = array[i];
        int j = i - 1;
        while (j >= 0) {
            if (value > array[j]) {
                break;
            }
            array[j+1] = array[j];
            j--;
        }
        array[j+1]= value;
    }
}

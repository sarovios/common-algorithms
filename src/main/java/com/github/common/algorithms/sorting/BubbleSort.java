package com.github.common.algorithms.sorting;

public class BubbleSort {

    private int[] array;
    private int length;

    public void sort(int[] array) {
        if (array == null) throw new NullPointerException("Array value cannot be null");
        this.array = array;
        this.length = array.length;
        bubbleSort();
    }

    private void bubbleSort() {
        boolean swap = true;
        while (swap) {
            swap = false;
            int i = 0, j = i + 1;
            while (j < length) {
                if (array[i] > array[j]) {
                    swap(i, j);
                    swap = true;
                }
                i++;
                j++;
            }
        }
    }

    private void swap(int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}

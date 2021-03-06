package com.github.common.algorithms.sorting;

//TODO: check with duplicates
public class MergeSort {

    private int[] array;
    private int[] tmp;
    private int length;

    public void sort(int[] array) {
        if (array == null) throw new NullPointerException("Array value cannot be null");
        this.array = array;
        this.length = array.length;
        this.tmp = new int[length];
        mergeSort(0, length - 1);
    }

    public void mergeSort(int low, int high) {
        if (low < high) {
            int middle = low + (high - low) / 2;
            mergeSort(low, middle);
            mergeSort(middle + 1, high);
            merge(low, middle, high);
        }
    }

    public void merge(int low, int middle, int high) {
        for (int i = low; i <= high; i ++) {
            tmp[i] = array[i];
        }
        int i = low;
        int j = middle + 1;
        int k = low;
        while (i <= middle && j <= high) {
            if (tmp[i] <= tmp[j]) array[k++] = tmp[i++];
            else array[k++] = tmp[j++];
        }
        while (i <= middle) {
            array[k++] = tmp[i++];
        }
        while (j <= high) {
            array[k++] = tmp[j++];
        }
    }


}

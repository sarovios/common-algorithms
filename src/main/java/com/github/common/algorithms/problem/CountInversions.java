package com.github.common.algorithms.problem;

/**
 * Input: An array of n values in arbitrary order
 * Output: The number of inversions, ie the number of pairs (i,j) of array
 * indices with i < j and A[i] > A[j].
 */
public class CountInversions {

    private int[] array;
    private int[] tmp;
    private int length;
    private long inversions;

    public CountInversions(int[] array) {
        this.array = array;
        this.tmp = new int[array.length];
        this.length = array.length;
        this.inversions = 0;
    }

    public void bruteForce() {
        for (int i = 0; i < (length-1) ; i++) {
            for (int j = (i+1); j < length; j++) {
                if (array[i] > array[j]) inversions++;
            }
        }
    }

    public void recursive(int low, int high) {
        if (low < high) {
            int middle = low + (high - low)/2;
            recursive(low, middle);
            recursive(middle + 1, high);
            mergeAndCountInversion(low, middle, high);
        }
    }

    private void mergeAndCountInversion(int low, int middle, int high) {
        for(int i = low; i <= high; i++) {
            tmp[i] = array[i];
        }
        int i = low;
        int j = middle + 1;
        int z = low;
        while( (i <= middle) && (j <= high) ) {
            if (tmp[i] < tmp[j]) array[z++] = tmp[i++];
            else {
                array[z++] = tmp[j++];
                inversions += middle - i + 1;
            }
        }
        while (i <= middle) {
            array[z++] = tmp[i++];

        }
        while ( j <= high) {
            array[z++] = tmp[j++];
        }
    }

    public long getInversions() {
        return this.inversions;
    }
}

package org.ggk.sorting;

import java.util.Arrays;

public class SortClient {

    public static void main(String[] args) {
        usingSelectionSort();
    }

    public static void usingSelectionSort() {

        System.out.println("Using Selection sort");
        SelectionSort selectionSort = new SelectionSort();
        int[] array = {1, 4, 2, 77, 342, 2, 4, 6, 3, 67};
        System.out.println("Before starting " + Arrays.toString(array));
        selectionSort.sort(array);
        System.out.println("After sorting " + Arrays.toString(array));

        System.out.println("Using Insertion sort");
        InsertionSort insertionSort = new InsertionSort();
        array = new int[]{1, 4, 2, 77, 342, 2, 4, 6, 3, 67};
        System.out.println("Before starting " + Arrays.toString(array));
        insertionSort.sort(array);
        System.out.println("After sorting " + Arrays.toString(array));
    }
}

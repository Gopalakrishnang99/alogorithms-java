package org.ggk.searching;

public class BinarySearch {

    public int search(int[] array, int element) {
        return searchIterative(array, element, 0, array.length - 1);
    }

    private int searchRecursive(int[] array, int element, int start, int end) {
        if (start > end)
            return -1;
        int mid = (start + end) / 2;
        if (array[mid] == element)
            return mid;
        if (element < array[mid])
            return searchRecursive(array, element, 0, mid);
        else
            return searchRecursive(array, element, mid + 1, array.length - 1);
    }

    private int searchIterative(int[] array, int element, int start, int end) {
        int mid;
        while (start <= end) {
            mid = (start + end) / 2;
            if (array[mid] == element)
                return mid;
            else if (element > array[mid])
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
    }
}

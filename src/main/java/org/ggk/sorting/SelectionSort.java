package org.ggk.sorting;

/**
 * @author Gopalakrishnan
 *
 * <p>Selection sort works by selecting the smallest element and placing it in the right place in the order
 * Find the smallest element in the array and swap it with the first element. Then find the next smallest item and
 * swapp it with the secind element and so on till the end of the array and all the elements are in the
 * sorted order.</p>
 */
public class SelectionSort {

    public void sort(int[] array) {
        if (array == null) return;
        for (int i = 0; i < array.length - 1; i++) {
            int smallestIndex = i; // Keep track of the smallest element of the current iteration
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[smallestIndex]) {
                    smallestIndex = j; // Updating the smallest element for the current iteration
                }
            }
            swapElements(array, i, smallestIndex); // Swapping the smallest element found with the current element
        }
    }

    private void swapElements(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

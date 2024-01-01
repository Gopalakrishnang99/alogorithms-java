package org.ggk.sorting;

/**
 * @author Gopalakrishnan
 * <p>
 * Insertion sort works by placing the current item in its correct place by comparing it with the previous one and
 * swapping it until the elements are in correct order.
 */
public class InsertionSort {

    public void sort(int[] array) {
        if (array == null)
            return;
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int j = i;
            while (j > 0 && array[j] < array[j - 1]) {
                swap(array, j, j - 1);
                j--;
            }
        }
    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}

package org.ggk.sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SelectionSortTest {

    @Test
    @DisplayName("Test for sorting array using selection sort algorithm")
    public void testSelectionSort() {
        int[] array = {5, 6, 3, 1, 1, 6, 8};
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(array);
        for (int i = 0; i < array.length - 1; i++) {
            Assertions.assertTrue(array[i] <= array[i + 1]);
        }
    }
}

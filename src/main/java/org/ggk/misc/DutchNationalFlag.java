package org.ggk.misc;

import java.util.Arrays;
import java.util.Random;

public class DutchNationalFlag {

    public static void main(String[] args) {
        int n = 13;
        int[] array = new int[n];
        for (int i = 0; i < n; i++)
            array[i] = new Random().nextInt(3);
        System.out.println("Unsorted array - " + Arrays.toString(array));
        DutchNationalFlag dnf = new DutchNationalFlag();
        dnf.sortZeroOneTwo(array);
        System.out.println("Array after sorting - " + Arrays.toString(array));
    }

    public void sortZeroOneTwo(int[] array) {
        int n = array.length;
        int low = 0;
        int mid = 0;
        int high = n - 1;
        while (mid <= high) {
            if (array[mid] == 0) {
                swap(array, mid++, low++);
            } else if (array[mid] == 1) {
                mid++;
            } else {
                swap(array, high--, mid);
            }
        }
    }

    private void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}

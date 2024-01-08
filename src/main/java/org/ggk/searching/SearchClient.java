package org.ggk.searching;

public class SearchClient {

    public static void main(String[] args) {

        BinarySearch binarySearch = new BinarySearch();
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Position of element 4 is "+binarySearch.search(array,4));
        System.out.println("Position of element 10 is "+binarySearch.search(array,10));
        System.out.println("Position of element 20 is "+binarySearch.search(array,20));
    }
}

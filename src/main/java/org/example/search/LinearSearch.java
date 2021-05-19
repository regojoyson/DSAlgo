package org.example.search;

public class LinearSearch {
    static int search(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int array[] = {3, 6, 1, 7, 4, 8, 9};
        LinearSearch linear = new LinearSearch();
        int result = linear.search(array, 1);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
    }
}
package org.example.sort;

class SelectionSort {
    // 0 1 2 3 4
    // 1, 2, 3, 4, 5
    void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
    void printArray(int[] arr) {
        for (int i = 0; i < arr.length; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        SelectionSort obj = new SelectionSort();
        int arr[] = { 4, 3, 5, 2, 1 };
        obj.sort(arr);
        System.out.println("Sorted array");
        obj.printArray(arr);

    }
}
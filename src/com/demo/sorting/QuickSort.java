package com.demo.sorting;

public class QuickSort {


    public static void quickSort(int[] arr, int low, int high) {

        if (low < high) {
            int pivotIndex = pivotIndexCalculate(arr, low, high);

            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }

    }

    private static int pivotIndexCalculate(int[] arr, int low, int high) {

        int i = low - 1;
        int pivot = arr[high];

        for (int j = low; j < high; j++) {

            if (arr[j] < pivot) {

                i++;

                // swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }

        }
        // sorting the pivot
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;

        return i;

    }

    public static void main(String[] args) {

        int[] arr = {2, 9, 6, 3, 5, 2, 8};
        quickSort(arr, 0, arr.length - 1);

        for (int x : arr) {
            System.out.print(x + ", ");
        }
    }


}

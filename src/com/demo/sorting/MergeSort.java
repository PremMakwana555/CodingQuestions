package com.demo.sorting;

public class MergeSort {

    public static void sortArray(int[] arr, int start, int end) {

        if (start >= end) {
            return;
        }

        int mid = (start + end) / 2;
        sortArray(arr, start, mid);
        sortArray(arr, mid + 1, end);
        merge(arr, start, mid + 1, end);

    }

    public static void merge(int[] arr, int start, int mid, int end) {

        int i = start;
        int j = mid;
        int k = 0;
        int[] temp = new int[end - start + 1];

        while (i < mid && j <= end) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i < mid) {
            temp[k++] = arr[i++];
        }
        while (j <= end) {
            temp[k++] = arr[j++];
        }

        for (int w = start, e = 0; w <= end; w++, e++) {
            arr[w] = temp[e];
        }

    }

    public static void main(String[] args) {

        int[] arr = {2, 8, 1, 3, 6, 7, 5, 4};
        System.out.println(java.time.LocalTime.now());

        sortArray(arr, 0, arr.length - 1);
        System.out.println(java.time.LocalTime.now());

        for (int f : arr) {
            System.out.println(f);
        }

    }
}

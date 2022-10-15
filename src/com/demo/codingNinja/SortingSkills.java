package com.demo.codingNinja;

import java.util.Scanner;

public class SortingSkills {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int j = 0; j < n; j++) {

                arr[j] = sc.nextInt();

            }

            mergeSort(arr, 0, n - 1);

            if (isSortedArray(arr, n)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");

            }

        }

    }

    public static void mergeSort(int[] arr, int start, int end) {

        if (start >= end) {
            return;
        }

        int mid = (start + end) / 2;

        mergeSort(arr, start, mid);
        merger(arr, mid);
        mergeSort(arr, mid + 1, end);
        merger(arr, mid);

    }

    public static void merger(int[] arr, int mid) {

        int leftpart = arr[mid];
        int rightpart = arr[mid + 1];

        if (leftpart > rightpart && leftpart - rightpart == 1) {
            arr[mid + 1] = leftpart;
            arr[mid] = rightpart;
        }
    }

    private static boolean isSortedArray(int[] array, int n) {
        // if(n == 1 || n == 0) return true;
        // return array[n-2] <= array[n-1] && isSortedArray(array, n-1);

        for (int i = 1; i < n; i++) {

            if (array[i - 1] > array[i]) {
                return false;
            }

        }

        return true;
    }


}

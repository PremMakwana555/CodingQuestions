package com.demo.Practise;

import java.util.Arrays;

public class ReveserseArray {

    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 32, 4, 5, 4};

        System.out.println(Arrays.toString(reverseArr(arr)));
    }

    private static int[] reverseArr(int[] arr) {

        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {

            int x = arr[i];
            arr[i] = arr[j];
            arr[j] = x;
        }

        return arr;
    }
}

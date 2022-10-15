package com.demo.codingNinja;

import java.util.Arrays;

public class BitCalculate {

    public static void main(String[] args) {

        int[] tenp = {3, 6, 2, 1, 4};


        sortArrayByKBit(tenp.length,5,tenp);

        for(int x : tenp){
            System.out.println(x);
        }

    }

    public static int[] sortArrayByKBit(int n, int k, int arr[]) {

//        int low = 0;
        int mid = 0;
//        int high = n-1;

        for(int i = 0; i < n; i++){

            int[] binary = getBinary(arr[i]);

            if(binary[k-1] == 0){
                int temp = arr[i];
                arr[i] = arr[mid];
                arr[mid] = temp;

                mid++;
            }

        }

        return arr;


    }

    public static int[] getBinary(int num){


        int arr[] = new int[34];

        int id = 0;

        // Number should be positive
        while (num > 0) {
            arr[id++] = num % 2;
            num = num / 2;
        }

        return arr;
    }
}

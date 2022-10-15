package com.demo.coding;

public class FlagAlgo {

    public static void main(String[] args) {

        int[] data = {1, 2, 0, 0, 2, 1, 2, 0, 2, 2, 1};
        flagA(data);
    }

    private static void flagA(int[] data) {

        int low = 0;
        int mid = 0;
        int high = data.length -1;

        while (mid <= high) {

            if (data[mid] == 0) {
                int temp = data[mid];
                data[mid] = data[low];
                data[low] = temp;

                mid++;
                low++;
            }
            if (data[mid] == 1) {
                mid++;
            }
            if (data[mid] == 2) {

                int temp = data[mid];
                data[mid] = data[high];
                data[high] = temp;

                high--;

            }
        }

        for (int d : data) {
            System.out.print(d);
        }

    }

}


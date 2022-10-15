package com.demo.Interview;

public class Question {


    public static boolean isSimilar(int[][] arr1, int[][] arr2) {

//        boolean [][] isTrue



        boolean isTrue = true;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {

                if (arr1[i][j] != arr2[i][j]) {
                    isTrue = false;
                }
            }

        }

        return isTrue;
    }

}

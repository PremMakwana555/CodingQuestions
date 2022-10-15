package com.demo.Java;

import java.util.stream.Stream;

public class MinNumOfSwaps {

    public static int minSwap(int N, int M, int K, String S, char[] arr) {
        int swaps = 0;
        int[][] charsIndex = new int[K][26];

//        char[] tempChar = S.toCharArray();

        for (int i = 0; i < K; i++)
            for (int j = 0; j < 26; j++)
                charsIndex[i][j] = 0;


        boolean[] given = new boolean[26];

        for (int i = 0; i < M; i++) {
            given[arr[i] - 'a'] = true;
        }

        for (int i = 0; i < N; i++) {
            charsIndex[i % K][S.charAt(i) - 'a'] += 1;
        }

        int inddex = 0;
        for (boolean b : given) {
            System.out.println(b + "index :" + inddex);
            inddex++;
        }

        Stream.of(charsIndex).forEach(System.out::println);


        int totalposition = N / K;
        for (int i = 0; i < K; i++) {
            int maxfrequency = 0;

            for (int j = 0; j < 26; j++) {

                if (charsIndex[i][j] > maxfrequency && given[j] == true) {
                    maxfrequency = charsIndex[i][j];
                }
            }

            swaps = totalposition - maxfrequency + (i % K < N % K ? 1 : 0);

        }

        return swaps;
    }
}

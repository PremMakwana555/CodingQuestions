package com.demo.Java;

import java.util.Arrays;
import java.util.Scanner;

public class Solution2 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        IntPair[] intPairs = new IntPair[n];
        for (int i = 0; i < n; i++) {

            IntPair intPair = new IntPair(sc.nextInt(), sc.nextInt());
            intPairs[i] = intPair;

        }

        Arrays.sort(intPairs, IntPair::compareTo);
        int value =1;
        int last = 0;
        for(int i = 0; i < n; i++){

            if(intPairs[i].x >= intPairs[last].y){
                value++;
                last = i;
            }


        }
        System.out.println(value);

    }

    public static class IntPair implements Comparable<IntPair> {

        int x;
        int y;

        public IntPair(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public int compareTo(IntPair o) {
            return this.y - o.y;
        }
    }

}


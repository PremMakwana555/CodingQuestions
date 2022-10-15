package com.demo.codingNinja;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class MinSwaps {

    public static int minSwaps(int[] arr) {

        
        int n = arr.length;
        Pair2[] pairs = new Pair2[n];

        for (int i = 0; i < n; i++) {

            pairs[i] = new Pair2(arr[i], i);

        }

        boolean[] vis = new boolean[n];
        int ans = 0;
        Arrays.sort(pairs);

        for (int i = 0; i < n; i++) {

            if (vis[i] == true || pairs[i].idx == i) {
                continue;
            }
            int cLen = 0;
            int j = i;
            while (vis[j] == false) {
                vis[j] = true;
                cLen++;
                j = pairs[j].idx;
            }
            ans += cLen - 1;

        }

        return ans;
    }

    static class Pair2 implements Comparable<Pair2> {

        int val;
        int idx;

        public Pair2(int val, int idx) {
            this.val = val;
            this.idx = idx;
        }


        @Override
        public int compareTo(Pair2 o) {
            return this.val - o.val ;
        }
    }
}

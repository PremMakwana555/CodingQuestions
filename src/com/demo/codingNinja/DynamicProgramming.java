package com.demo.codingNinja;

import java.util.ArrayList;
import java.util.Scanner;

public class DynamicProgramming {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int fib = sc.nextInt();

      //  System.out.println(fibNum(fib, new int[fib + 1]));
        System.out.println(fibDp(fib));

    }

    private static int fibNum(int fib, int[] qb) {

        if (fib == 0) {
            return 1;
        }
        if (fib < 0) {
            return 0;
        }
        if (qb[fib] > 0) {
            return qb[fib];
        }



        int fibnm1 = fibNum(fib - 1, qb);
        int fibnm2 = fibNum(fib - 2, qb);

        int ans = fibnm1 + fibnm2;

        qb[fib] = ans;

        return ans;
    }

    static int fibDp(int fib) {

        int[] dp = new int[fib + 1];

        dp[0] = 1;
        for (int i = 1; i <= fib; i++) {
            if (i == 1) {
                dp[i] = dp[i - 1];
            } else {
                dp[i] = dp[i - 1] + dp[i - 2];
            }
        }
        return dp[fib];
    }
}

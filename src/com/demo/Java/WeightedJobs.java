package com.demo.Java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class WeightedJobs {


    public static int binarySearch(Jobs jobs[], int index) {

        int lo = 0, hi = index - 1;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (jobs[mid].end <= jobs[index].start) {
                if (jobs[mid + 1].end <= jobs[index].start)
                    lo = mid + 1;
                else
                    return mid;
            } else
                hi = mid - 1;
        }

        return -1;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        Jobs[] jobs = new Jobs[n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            Jobs job = new Jobs(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken()));
            jobs[i] = job;
        }

        System.out.println(weightedJobs(jobs));

    }

    public static int weightedJobs(Jobs[] jobs) {

        int n = jobs.length;
        Arrays.sort(jobs);
        int[] dp = new int[n];
        dp[0] = jobs[0].profit;

        for (int i = 1; i < n; i++) {
            int including = jobs[i].profit;
            int LNConf = binarySearch(jobs, i);
            if (LNConf != -1) {
                including += dp[LNConf];
            }
            dp[i] = Math.max(including, dp[i - 1]);

        }
        return dp[n - 1];


    }


    public static class Jobs implements Comparable<Jobs> {

        int start;
        int end;
        int profit;

        public Jobs(int start, int end, int profit) {
            this.start = start;
            this.end = end;
            this.profit = profit;
        }

        @Override
        public int compareTo(Jobs o) {
            return this.end - o.end;
        }
    }


}


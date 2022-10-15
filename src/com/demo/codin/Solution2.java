package com.demo.codin;

import java.util.*;

public class Solution2 {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[] nums = new int[n];
            for (int j = 0; j < n; j++) {
                nums[j] = sc.nextInt();
            }

            System.out.println(getSum(nums));
        }

    }

    public static long getSum(int[] nums) {

        List<Integer> temp = new ArrayList<>();
        for (Integer n : nums) {
            temp.add(n);
        }

        long sum = 0;
        Collections.sort(temp);

        int[] presum = new int[nums.length];
        presum[0] = 0;
        int currsum = temp.get(0);
        for (int i = 1; i < nums.length; i++) {

           if(temp.get(i).equals(temp.get(i-1))){
               presum[i] = presum[i-1];
           }else{
               presum[i] = presum[i-1]+ currsum + temp.get(i-1);
           }
            currsum += temp.get(i);
        }
        for (int i : presum) {
            System.out.println(i);
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(temp.get(i), presum[i]);

        }

        for (int i = 1; i < nums.length; i++) {

            sum = +map.get(nums[i]);

        }


        return sum;

    }

}

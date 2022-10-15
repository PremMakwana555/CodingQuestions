package com.demo.Practise;

import java.util.Arrays;
import java.util.Stack;

class Solution {
    public int[] numberOfPairs(int[] nums) {

        Arrays.sort(nums);
        int pairs = 0;
        Stack<Integer> stack = new Stack<>();

        stack.push(nums[0]);
        for (int i = 1; i < nums.length - 1; i++) {

            if (stack.peek() == nums[i]) {
                stack.pop();
                pairs++;
            } else {
                stack.push(nums[i]);
            }

        }

        int[] arr = {pairs, stack.size()};
        return arr;

    }
}

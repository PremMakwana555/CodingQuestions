package com.demo.coding;

public class Solution1 {


    public static int pivotIndex(int[] nums){

        int leftSum = 0;
        int rightSum = 0;

        for(int i =1; i < nums.length; i ++){
            rightSum += nums[i];
        }

        if(leftSum == rightSum){
            return 0;
        }

        for(int i = 1 ; i < nums.length; i ++){

            leftSum += nums[i-1];
            rightSum -= nums[i];

            if(leftSum == rightSum){
                return i;
            }
        }

        System.out.println(rightSum);

        return -1;
    }

    public static void main(String[] args) {

        int[] nums = {-1,-1,0,1,1,0};


        System.out.println(pivotIndex(nums));
    }
}

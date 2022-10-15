package com.demo.Interview;

import java.util.HashMap;

public class Demo {

//array=[8,6,3,5,2] sum = 9



    public static void main(String[] args) {


        System.out.println( );

    }

    // approach 1
    public static int[] getIndex(int[] arr, int sum){

        HashMap<Integer, Integer> map = new HashMap<>();

        //put all elements in hashmap
        for(int i = 0; i < arr.length; i++){
            map.put( arr[i], i );
        }

        int[] ans = new int[2];
        for(int i = 0; i < arr.length; i++){

            int temp = sum - arr[i];

            if(map.containsKey(temp)){
                ans[0] = i;
                ans[1] = map.get(temp);
            }

        }

        return ans;
        // time complexity --> O(n)
       // space complexity --> O(N)

    }


}

package com.demo.coding;

import java.util.Scanner;

public class Main {

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        String input = s.next();
        System.out.println(Solution.removeConsecutiveDuplicates(input));
    }
}
 class Solution {

    public static String removeConsecutiveDuplicates(String s) {

        if(s.length() == 0){
            return "";
        }

        if(s.charAt(0) == s.charAt(1)){

            int index = 0;
            while(s.charAt(0) == s.charAt(index) && index < s.length() -1){
                index ++;
            }

            return String.valueOf(s.charAt(0)) + removeConsecutiveDuplicates(s.substring(index));
        }
        else{
            return String.valueOf(s.charAt(0)) + removeConsecutiveDuplicates(s.substring(1));
        }

    }

}
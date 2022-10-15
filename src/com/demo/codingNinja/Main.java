package com.demo.codingNinja;

public class Main {

    public static void main(String[] args) {

        System.out.println(removeConsecutiveDuplicates("FFFRRTTTTTTTFFDFDFDDDD"));


    }
    public static String removeConsecutiveDuplicates(String s) {

        int n = s.length();
        if(n == 0 || n == 1){
            return s;
        }

        if(s.charAt(0) == s.charAt(1)){

            int index = 0;

            while(s.charAt(index) == s.charAt(0) && index < s.length()){
                index ++;
            }

            return s.substring(0,1) + removeConsecutiveDuplicates(s.substring(index));
        }

        return s.substring(0,1) + removeConsecutiveDuplicates(s.substring(1));

    }
}



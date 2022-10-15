package com.demo.Practise;

public class StringDemo {

    public static void main(String[] args) {
        String s = "1212133132";
        int x = Integer.parseInt(s);

        int[] temp = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            temp[i] =x % 10;
            x/=10;
        }

        for ( int j :temp ) {
            System.out.println(j);
        }

    }
}

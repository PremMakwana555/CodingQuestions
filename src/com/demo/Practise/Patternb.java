package com.demo.Practise;

public class Patternb {

    public static void Pattern(int n) {

        for (int i = 0; i <= n-1; i++) {


            for (int j = 0; j <= i; j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        Pattern(n);
    }
}

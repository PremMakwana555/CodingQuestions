package com.demo.coding;

import java.util.Scanner;

public class runner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        System.out.println(Demo.convertStringToInt(input));
    }
}

class Demo {

    public static int convertStringToInt(String input) {

        return find(input, input.length() - 1);

    }

    public static int find(String input, int i) {

        if (i < 0) {
            return 0;
        }


        return Integer.parseInt(String.valueOf(input.charAt(i))) + 10 * (find(input, i - 1));


    }
}

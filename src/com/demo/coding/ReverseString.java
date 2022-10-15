package com.demo.coding;

import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverseWords("i.Like.you"));
    }

    public static String reverseWords(String s) {

        Stack<String> stack = new Stack<>();
        String temp = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '.') {
                temp += s.charAt(i);
            } else {
                stack.push(temp);
                temp = "";
            }
        }
        String result ="";

        while (!stack.isEmpty()){
            result +=stack.pop();
        }
return result;
    }
}

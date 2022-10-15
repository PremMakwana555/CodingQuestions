package com.demo.coding;

import java.util.Stack;

public class StringPattern {

    public static boolean isValid(String s) {

        Stack<Character> bracs = new Stack<>();

        for (char c : s.toCharArray()) {

            if (c == '(' || c == '{' || c == '[') {
                bracs.push(c);
            }
            else if(c==')' && !bracs.isEmpty() && bracs.peek() == '('){
                bracs.pop();
            }else if(c=='}' && !bracs.isEmpty() && bracs.peek() == '{'){
                bracs.pop();
            }
            else if(c==']' && !bracs.isEmpty() && bracs.peek() == '['){
                bracs.pop();
            }



        }

        return bracs.isEmpty();
    }

    public static void main(String[] args) {

        System.out.println(isValid("}"));
    }
}


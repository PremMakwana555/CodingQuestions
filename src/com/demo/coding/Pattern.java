package com.demo.coding;

import java.util.HashMap;

public class Pattern {

    public static void main(String[] args) {

        String s = "fsafdss";


        System.out.println(lengthOfLongestSubstring(s));

    }

    public static int lengthOfLongestSubstring(String s) {
        int st = 0;
        int currlen = 0;
        int maxlen = 0;
        int start = 0;

        HashMap<Character, Integer> map = new HashMap<>();

        map.put(s.charAt(0), 0);

        for (int i = 0; i < s.length(); i++) {

            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), i);
            } else {

                currlen = i - st;
                if (map.get(s.charAt(i)) >= st) {

                    if (maxlen < currlen) {
                        maxlen = currlen;
                        start = st;
                    }

                    st = map.get(s.charAt(i)) + 1;
                }

                map.replace(s.charAt(i), i);
            }

            if (maxlen < i - st) {
                maxlen = i - st;
                start = st;
            }
        }

        return maxlen;

    }
}

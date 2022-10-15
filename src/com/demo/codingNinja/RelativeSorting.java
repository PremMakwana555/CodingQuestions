package com.demo.codingNinja;

import java.util.*;

public class RelativeSorting {

    public static List<Integer> relativeSorting(List<Integer> arr, List<Integer> brr, int n, int m) {

        List<Integer> ans = new ArrayList<>();

        Map<Integer, Integer> map = new TreeMap<>();

        for (int i = 0; i < n; i++) {

            if (map.containsKey(arr.get(i))) {
                map.put(arr.get(i), map.get(arr.get(i)) + 1);
            } else {
                map.put(arr.get(i), 1);
            }

        }

        for (int i = 0; i < m; i++) {
            int count = map.getOrDefault(brr.get(i), 0);

            while (count > 0) {
                ans.add(brr.get(i));
                count--;
            }

            map.remove(brr.get(i));
        }
        map.forEach((k, v) -> System.out.println(k + " --> " + v));
        map.forEach((k, v) -> ans.add(k));

        return ans;
    }

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while (t-- > 0) {
            int n = s.nextInt();
            int m = s.nextInt();
            List<Integer> arr = new ArrayList<>();
            int x = n;
            while (x-- > 0) {
                int temp = s.nextInt();
                arr.add(temp);
            }
            List<Integer> brr = new ArrayList<>();
            int y = m;
            while (y-- > 0) {
                int temp = s.nextInt();
                brr.add(temp);
            }

            List<Integer> ans = relativeSorting(arr, brr, n, m);
            for (int i = 0; i < ans.size(); ++i) {
                sb.append(ans.get(i) + " ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
        s.close();
    }
}

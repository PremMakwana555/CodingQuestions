package com.demo.Java;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Solution {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int capacity = sc.nextInt();

        Items[] items = new Items[n];

        for (int i = 0; i < n; i++) {

            double val = sc.nextDouble();
            double wet = sc.nextDouble();
            Items item = new Items(val, wet);

            items[i] = item;

        }
        double ans = fractionalKnapsack(capacity, items, n);
        System.out.format("%.6f",ans);

    }

    public static double fractionalKnapsack(int capacity, Items[] items, int n) {
        double value = 0.0;
        int currWeight = 0;

        Arrays.sort(items, new ItemComparator());

        for (int i = 0; i < n; i++) {

            if (currWeight + items[i].weight <= capacity) {

                currWeight += items[i].weight;
                value += items[i].value;

            } else {
                int remain = (capacity - currWeight);
                value += (items[i].value / items[i].weight) * remain;
                break;
            }

        }

        return value;
    }

    public static class Items {

        double value;
        double weight;


        public Items(double value, double weight) {
            this.value = value;
            this.weight = weight;

        }

    }

    public static class ItemComparator implements Comparator<Items> {

        @Override
        public int compare(Items o1, Items o2) {
            double r1 = o1.value / o1.weight;
            double r2 = o2.value / o2.weight;

            return Double.compare(r2, r1);
        }
    }

}



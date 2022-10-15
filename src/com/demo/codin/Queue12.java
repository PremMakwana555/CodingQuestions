package com.demo.codin;

import java.util.PriorityQueue;

public class Queue12 {


    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(11);
        pq.add(10);
        pq.add(22);
        pq.add(5);
        pq.add(12);
        pq.add(2);

        while (pq.isEmpty() == false){
            System.out.printf("%d" , pq.remove());

            System.out.println("\n");
        }

    }
}

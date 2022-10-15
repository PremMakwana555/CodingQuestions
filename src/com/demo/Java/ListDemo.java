package com.demo.Java;

import java.util.*;
import java.util.stream.Collectors;

public class ListDemo {

    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();

        integerList.add(1);
        integerList.add(5);
        integerList.add(16);
        integerList.add(1);

        Integer[] arr = {1, 2, 4, 35, 45, 4, 6, 57, 6, 7};

        List<Integer> linkedList = new LinkedList<>();

        linkedList.addAll(integerList);

        linkedList.stream().forEach(System.out::println);
        List<Integer> integerList1 = new ArrayList<>();

        Collections.addAll(integerList1, arr);

        Arrays.stream(arr).collect(Collectors.toList());


    }
}

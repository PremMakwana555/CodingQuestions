package com.demo.Practise;

import java.util.*;

public class IteratorDemo {

    public static void main(String[] args) {

        List<String> stringLinkedList = new LinkedList<>();

        stringLinkedList.add("PREM");
        stringLinkedList.add("PRem");
        stringLinkedList.add("PreM");
        stringLinkedList.add("Prem");
        stringLinkedList.add("pREM");


        Iterator<String> utr = stringLinkedList.iterator();


        ListIterator<String> lt = stringLinkedList.listIterator();

        while (utr.hasNext()) {
            System.out.println(utr.next());
        }

        while (lt.hasNext()) {
            if (Objects.equals(lt.next(), "Prem")) {
                lt.previous();
            }
            System.out.println(lt.next());
        }

    }

}

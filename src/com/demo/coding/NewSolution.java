package com.demo.coding;

public class NewSolution {


    public static void main(String[] args) {

        ListNode list1 = new ListNode(2);
        ListNode list2 = new ListNode(1);

        ListNode head = mergeTwoLists(list1,list2);

        LinkedListDemo.printf(head);
    }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if (list1 == null) return list2;
        if (list2 == null) return list1;


        ListNode head = null, tail = null;

        if (list1.val <= list2.val) {
            head = tail = list1;
            list1 = list1.next;
        } else {
            head = tail = list2;
            list2 = list2.next;
        }

        while (list1 != null && list2 != null) {

            if (list1.val <= list2.val) {
                tail.next = list1;
                tail = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                tail = list2;
                list2 = list2.next;
            }

        }

        if (list1 == null) tail.next = list2;
        else
            tail.next = list2;


        return head;


    }
}

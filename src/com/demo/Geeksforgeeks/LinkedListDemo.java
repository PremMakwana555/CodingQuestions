package com.demo.Geeksforgeeks;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class LinkedListDemo {

    public static void main(String[] args) {
/*
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);*/

        Node head = null;
        head = insertAtBegin(head, 30);
        head = insertAtBegin(head, 20);
        head = insertAtBegin(head, 10);

        printList(head);
    }

    public static Node printList(Node head) {

        //printing using normal call
        /*Node curr = head;
        while (curr != null){
            System.out.println(curr.data);
            curr =curr.next;
        }*/


        //printing using recursion

        if (head == null) return null;

        System.out.println(head.data);
        return (printList(head.next));
    }


    public static Node insertAtBegin(Node head, int a) {

        Node temp = new Node(a);
        temp.next =head;

        return head;

    }
}

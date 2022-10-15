package com.demo.coding;


public class InsertDataLinked {

    public static void main(String[] args) {

//        Node head = new Node(10);
//        head.next = new Node(20);
//        head.next.next = new Node(30);
//
//        int pos = 2, data = 70;
//        head = insertPosition(head, pos, data);
//
//        LinkedListDemo.printf(head);


    }

    private static Node insertPosition(Node head, int pos, int data) {

        Node temp = new Node(data);
        Node curr = head;

        for (int i = 1; i <= pos -2 && curr != null ; i ++){
            curr = curr.next;

        }

        temp.next = curr.next;
        curr.next = temp;

        return head;

    }
}

package com.demo.coding;




public class LinkedListDemo {

    public static void main(String[] args) {


        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);



//       head = insertAtBegining(head,30);
//     //  head = insertAtEnd(head, 90);
//        printf(head);
//        System.out.println("*****************************");
//        head = deleteHead(head);
//        printf(head);
//        head = deleteTail(head);
    }

    private static Node deleteTail(Node head) {

        if(head == null)
            return null;
       if(head.next == null)
           return null;

       Node curr = head;

       while (curr.next.next != null){
           curr =curr.next;
       }
        curr.next = null;

       return head;
    }

    private static Node deleteHead(Node head) {

        if(head == null)
            return null;
        else
            return head.next;

    }

    private static Node insertAtEnd(Node head, int data) {
        Node curr = new Node(data);
        while (true){

            if (head.next == null){
                curr = head.next;
                break;
            }
           curr =  curr.next;

        }
        return head;
    }

    private static Node insertAtBegining(Node head, int data) {

        Node curr = new Node(data);
        curr.next = head;
        return curr;
    }

    protected static void printf(ListNode head) {
       ListNode curr = head;

        //Iterative solution
        while (curr !=null){
            System.out.print(curr.val + " ");
            curr = curr.next;
        }

        if(head == null)
            return;

        System.out.print(head.val + " ");
        printf(head.next);


    }




}

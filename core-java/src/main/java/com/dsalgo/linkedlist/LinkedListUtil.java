package com.dsalgo.linkedlist;

/**
 * class to hold linked list util methods
 *
 * @author Srinath.Rayabarapu
 */
public class LinkedListUtil {

    /**
     * prints passed linked list
     * @param head
     */
    public static void printList(Node head) {
        while (head != null) {
            System.out.println(head);
            head = head.next;
        }
    }
}

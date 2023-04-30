/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.middleofthelinkedlist;

/**
 *
 * @author viktor
 */
public class MiddleOfTheLinkedListTest {

    static int [] _startOfListNodes = {1, 2, 3, 4, 5, 6, 7};
    static ListNode startOfListNodes = makeLinkedList(_startOfListNodes);
    
    static int [] _startOfListNodes1 = {1, 2, 3, 4, 3, 2, 1};
    static ListNode startOfListNodes1 = makeLinkedList(_startOfListNodes1);
    
    static int [] _startOfListNodes2 = {1, 2, 3, 3, 2, 1};
    static ListNode startOfListNodes2 = makeLinkedList(_startOfListNodes2);
    
    static int [] _head1 = {1};
    static ListNode head1 = makeLinkedList(_head1);
    
    static int [] _head2 = {1, 2, 2, 1};
    static ListNode head2 = makeLinkedList(_head2);
    
    static int [] _head3 = {1, 2, 3, 4, 3, 2, 1};
    static ListNode head3 = makeLinkedList(_head3);
    
    public static void run() {
        test();
    }
    
    static void test() {
        System.out.println(isPalindrome(head1));
        System.out.println(isPalindrome(head2));
        System.out.println(isPalindrome(head3));
    }

    static ListNode middleNode(ListNode head) {
        int k = 0;
        ListNode next = head.next;
        ListNode middle = head;
        while (next != null) {
            if (k % 2 == 0) {
                middle = middle.next;
            }
            next = next.next;
            k++;
        }
        return middle;
    }
    
    static ListNode middleNode1(ListNode head, int[] count) {
        int k = 0;
        ListNode next = head.next;
        ListNode middle = head;
        while (next != null) {
            if (k % 2 == 0) {
                middle = middle.next;
            }
            next = next.next;
            k++;
        }
        count[0] = k + 1;
        return middle;
    }
    
    static ListNode reversedFrom(ListNode head, ListNode fromListNode) {
        ListNode result = new ListNode(head.val);
        ListNode next = head.next;
        while(next != null && next != fromListNode) {
            result = new ListNode(next.val, result);
            next = next.next;
        }
        return result;
    }
    
    static int countOfElementsInListNode(ListNode head) {
        int count = 0;
        while (head != null) {
            head = head.next;
            count++;
        }
        return count;
    }
    
    static boolean isPalindrome(ListNode head) {
        int[] count = new int[1];
        ListNode middle = middleNode1(head, count);
        ListNode reversed = reversedFrom(head, middle);
        if (count[0] % 2 == 1) {
            middle = middle.next;
        }
        while (middle.next != null && reversed.next != null) {
            if (middle.val != reversed.val) {
                return false;
            }
            middle = middle.next;
            reversed = reversed.next;
        }
        return middle.val == reversed.val;
    }
    
    static ListNode makeLinkedList(int[] values) {
        if (values.length == 0) {
            return null;
        }
        ListNode first = new ListNode(values[0]);
        ListNode last = first;
        
        for (int i = 1; i < values.length; i++) {
            ListNode tmp = new ListNode(values[i]);
            last.addNext(tmp);
            last = tmp;
        }
        
        return first;
    }
}

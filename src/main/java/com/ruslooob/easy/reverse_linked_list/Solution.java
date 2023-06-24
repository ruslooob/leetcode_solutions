package com.ruslooob.easy.reverse_linked_list;

import java.util.Stack;

class Solution {
    public ListNode reverseList1(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }

        var dummy = new ListNode();
        var tail = dummy;

        while (!stack.isEmpty()) {
            tail.next = new ListNode(stack.pop());
            tail = tail.next;
        }

        return dummy.next;
    }

    public ListNode reverseList2(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        while (head != null) {
            stack.push(head);
            head = head.next;
        }

        var dummy = new ListNode();
        var tail = dummy;

        while (!stack.isEmpty()) {
            tail.next = stack.pop();
            tail = tail.next;
        }
        tail.next = null;

        return dummy.next;
    }

}
package com.ruslooob.easy.merge_two_sorted_lists;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    Solution solution = new Solution();


    @Test
    @Disabled
    void mergeTwoLists() {
//        ListNode firstListHead = new ListNode();
//        firstListHead.
//        ListNode secondListHead = new ListNode();
//        ListNode result = new ListNode();
    }


    @Test
    void mergeTwoListsAdvanced() {
        ListNode firstListHead = new ListNode(1);
        firstListHead.next = new ListNode(2);
        firstListHead.next.next = new ListNode(3);

        ListNode secondListHead = new ListNode(1);
        secondListHead.next = new ListNode(3);
        secondListHead.next.next = new ListNode(4);

        ListNode outputListHead = new ListNode(1);
        outputListHead.next = new ListNode(1);
        outputListHead.next.next = new ListNode(2);
        outputListHead.next.next.next = new ListNode(3);
        outputListHead.next.next.next.next = new ListNode(4);
        outputListHead.next.next.next.next.next = new ListNode(4);

        ListNode result = solution.mergeTwoLists(firstListHead, secondListHead);
        while (result.next != null) {
            assertEquals(result.val, outputListHead.val);
            result = result.next;
            outputListHead = outputListHead.next;
        }
    }
}
package com.ruslooob.easy.remove_duplicates_from_sorted_list;

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode ptr = head;
        while (ptr != null) {
            while (ptr.next != null && ptr.next.val == ptr.val) {
                ptr.next = ptr.next.next;
            }
            ptr = ptr.next;
        }
        return head;
    }
}
package com.ruslooob.easy.merge_two_sorted_array;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = 0;
        for (int i = 0; i < nums1.length; i++) {
            if (j < n && nums2[j] != 0) {
                if (nums1[i] > nums2[j]) {
                    int tmp = nums1[i];
                    nums1[i] = nums2[j];
                    nums2[j] = tmp;
                } else if (nums1[i] == 0) {
                    nums1[i] = nums2[j];
                    j++;
                }
            }
        }
    }
}
package com.ruslooob.easy.maximum_depth_of_binary_tree;

class Solution {

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftResult = maxDepth(root.left);
        int rightResult = maxDepth(root.right);
        return 1 + Math.max(leftResult, rightResult);
    }
}
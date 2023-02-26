package com.ruslooob.easy.binary_tree_inorder_traversal;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        var res = new ArrayList<Integer>();
        inorderTraversal(root, res);
        return res;
    }

    public void inorderTraversal(TreeNode node, List<Integer> values) {
        if (node != null) {
            values.add(node.val);
            inorderTraversal(node.left, values);
            inorderTraversal(node.right, values);
        }
    }
}
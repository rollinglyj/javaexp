package ext110;

import java.util.List;
import java.util.Queue;
import java.util.LinkedList;
import per.resource.TreeNode;
import per.resource.ListNode;

public class Solution {
    public int minDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        if(root.left != null && root.right == null) {
            return minDepth(root.left) + 1;
        }
        if(root.left == null && root.right != null) {
            return minDepth(root.right) + 1;
        }
        return ((minDepth(root.left) > minDepth(root.right)) ? (minDepth(root.right) + 1) : (minDepth(root.left) + 1));
    }

    public static void main(String[] args) {
        Solution s1 = new Solution();
        TreeNode p1 = new TreeNode(1);
        TreeNode p2 = new TreeNode(2);
        p1.left = p2;
        TreeNode q1 = new TreeNode(3);
        TreeNode q2 = new TreeNode(4);
        TreeNode q3 = new TreeNode(5);
        q1.left = q2;
        q1.right = q3;
        p1.right = q1;
        System.out.println(s1.minDepth(p1));
    }
}

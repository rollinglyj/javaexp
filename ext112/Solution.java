package ext112;

import java.util.List;
import java.util.Queue;
import java.util.LinkedList;
import per.resource.TreeNode;
import per.resource.ListNode;

public class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null) {
            return false;
        }
        if(root.left == null && root.right == null && root.val == sum) {
            return true;
        }
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
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
        System.out.println(s1.hasPathSum(p1,3));
    }
}

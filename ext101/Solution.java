package ext101;
import per.resource.TreeNode;

public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root==null)return true;    
        return isSymmetric(root.left, root.right);
    }

    public boolean isSymmetric(TreeNode p, TreeNode q) {
        if(p == null && q == null) {
            return true;
        }
        if((p != null && q == null) || (p == null && q != null)) {
            return false;
        }
        if(p.val != q.val) {
            return false;
        }
        else {
            return isSymmetric(p.left, q.right) && isSymmetric(p.right, q.left);
        }
    }

    public static void main(String[] args) {
        Solution s1 = new Solution();
        TreeNode p1 = new TreeNode(5);
        TreeNode p2 = new TreeNode(3);
        p1.left = p2;
        TreeNode q1 = new TreeNode(5);
        TreeNode q2 = new TreeNode(3);
        p1.right = q2;
        System.out.println(s1.isSymmetric(p1));
    }
}

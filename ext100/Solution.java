package ext100;
import per.resource.TreeNode;

public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) {
            return true;
        }
        if((p != null && q == null) || (p == null && q != null)) {
            return false;
        }
        if(p.val != q.val) {
            return false;
        }
        else{
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
    }

    public static void main(String[] args) {
        Solution s1 = new Solution();
        TreeNode p1 = new TreeNode(5);
        TreeNode p2 = new TreeNode(3);
        p1.left = p2;
        TreeNode q1 = new TreeNode(5);
        TreeNode q2 = new TreeNode(3);
        q1.left = q2;
        System.out.println(s1.isSameTree(p1,q1));
    }
}

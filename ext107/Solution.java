package ext107;
import java.util.List;
import java.util.Queue;
import java.util.LinkedList;
import per.resource.TreeNode;
import per.resource.ListNode;

public class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        Queue<Integer> queueint = new LinkedList<Integer>();
        List<List<Integer>> listres=new LinkedList<List<Integer>>();
        if(root == null) {
            return listres;
        }
        queue.offer(root);
        queueint.offer(1);
        TreeNode TN;
        int level = 1, lastlevel = 0;
        while(!queue.isEmpty()) {
            TN = queue.poll();
            level = queueint.poll();
            if(level > lastlevel){
                LinkedList<Integer> list1 = new LinkedList<Integer>();
                listres.add(0, list1);
                
            }
            
            if(TN == null) {
                continue;
            }
            listres.get(0).add(TN.val);
            lastlevel = level;
            if(TN.left != null) {
                queue.offer(TN.left);
                queueint.offer(level + 1);
            }
            if(TN.right != null) {
                queue.offer(TN.right);
                queueint.offer(level + 1);
            }
        }
        return listres;
    }

    public static void main(String[] args) {
        Solution s1 = new Solution();
        TreeNode p1 = new TreeNode(1);
        TreeNode p2 = new TreeNode(3);
        p1.left = p2;
        TreeNode q1 = new TreeNode(5);
        TreeNode q2 = new TreeNode(3);
        q1.left = q2;
        p1.right = q1;
        System.out.println(s1.levelOrderBottom(p1));
    }
}

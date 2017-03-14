package ext118;
import java.util.List;
import java.util.Queue;
import java.util.LinkedList;
import per.resource.TreeNode;
import per.resource.ListNode;

public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> listres = new LinkedList<List<Integer>>();
        int i = 0, j = 0;
        for(i = 1; i < numRows + 1; i++) {
            LinkedList<Integer> list1 = new LinkedList<Integer> ();
            listres.add(list1);
            for(j = 1; j < i + 1; j++) {
                if(j == 1 || j == i ) {
                    listres.get(listres.size() - 1).add(1);
                    continue;
                }
                listres.get(listres.size() - 1).add(listres.get(listres.size() - 2).get(j - 1) + listres.get(listres.size() - 2).get(j - 2));
                
            }
        }
        return listres;
    }

    public static void main(String[] args) {
        Solution s1 = new Solution();
        TreeNode p1 = new TreeNode(5);
        TreeNode p2 = new TreeNode(3);
        p1.left = p2;
        TreeNode q1 = new TreeNode(5);
        TreeNode q2 = new TreeNode(3);
        q1.left = q2;
        p1.right = q1;
        System.out.println(s1.generate(5));
    }
}

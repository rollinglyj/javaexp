package ext119;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.LinkedList;
import per.resource.TreeNode;
import per.resource.ListNode;

public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> listres = new LinkedList<List<Integer>>();
        LinkedList<Integer> list1 = new LinkedList<Integer>();
        LinkedList<Integer> list2 = new LinkedList<Integer>();
        listres.add(list1);
        listres.add(list2);
        int i,j;
        for(i = 0; i < rowIndex + 2; i++) {
            listres.get(i % 2).clear();
            for(j = 1; j < i + 1; j++) {
                if(j == 1 || j == i) {
                    listres.get(i % 2).add(1);
                    continue;
                }
                listres.get(i % 2).add(listres.get(1 - i % 2).get(j - 1) + listres.get(1 - i % 2).get(j - 2));  
            }
        }
        return listres.get((rowIndex + 1) % 2);
    }

    public static void main(String[] args) {
        Solution s1 = new Solution();
        System.out.println(s1.getRow(3));
    }
}

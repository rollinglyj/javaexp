package ext121;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.LinkedList;
import per.resource.TreeNode;
import per.resource.ListNode;

public class Solution {
     public int maxProfit(int[] prices) {
        if(prices.length <= 1) {
            return 0;
        }
        int profit = 0 ;
        int min = prices[0];
        for(int i = 0; i < prices.length; i++) {
            min = Math.min(min, prices[i]);
            profit = Math.max(profit, prices[i] - min);
        }
        return profit;
    }

    public static void main(String[] args) {
        Solution s1 = new Solution();
        int [] lt = {2,9, 1, 5, 3, 6, 4};
        System.out.println(s1.maxProfit(lt));
    }
}

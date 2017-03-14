package ext169;

import java.util.HashMap;


public class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length ==0) {
            return 0;
        }
        if(nums.length ==1 ) {
            return nums[0];
        }
        int i = 0;
        int cnt;
        int maxcnt = 1;
        int maxnum = nums[0];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                cnt = map.get(nums[i]);
                map.remove(nums[i]);
                cnt++;
                if(cnt > maxcnt) {
                    maxcnt = cnt;
                    maxnum = nums[i];
                }
                map.put(nums[i], cnt);
            }
            else {
                map.put(nums[i], 1);
            }
        }
        return maxnum;
    }

    public static void main(String[] args) {
        Solution s1 = new Solution();
        int [] nums ={5, 6, 4, 4, 4};
        System.out.println(s1.majorityElement(nums));
    }
}

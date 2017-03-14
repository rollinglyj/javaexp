package ext136;

import java.util.*;

public class Solution {
    public int singleNumber(int[] nums) {
        int res = 0;
        for(int i = 0; i < nums.length; i++) {
            res = res ^ nums[i];
        }
        return res;
    }

    public static void main(String[] args) {
        Solution s1 = new Solution();
        int [] nums = {2, 31, 12, 2, 31};
        System.out.println(s1.singleNumber(nums));
    }
}

package ext198;


public class Solution {
    public int rob(int[] nums) {
        int PreNo = 0;
        int PreYes = 0;
        int NowNo = 0;
        for(int i = 0; i < nums.length; i++) {
            NowNo = Math.max(PreNo, PreYes);
            PreYes = nums[i] + PreNo;
            PreNo = NowNo;
        }
        return Math.max(PreNo, PreYes);
    }

    public int rob(int[] nums, int start) {
        if(start == nums.length - 1) {
            return nums[start];
        }
        if(start > nums.length - 1) {
            return 0;
        }
        return nums[start] + rob(nums, start + 2) > rob(nums, start + 1) ? nums[start] + rob(nums, start + 2) : rob(nums, start + 1);
    }

    public static void main(String[] args) {
        Solution s1 = new Solution();
        int[] nums ={3, 4, 6, 2, 5};
        System.out.println(s1.rob(nums));
    }
}

package ext189;

import java.util.HashMap;


public class Solution {
    public void rotate(int[] nums, int k) {
//          k=k%nums.length;
//          if(k==0 || nums.length<1)return;
//          int [] nums1=new int[nums.length];
//          for(int i=0;i<nums.length;i++){
//              nums1[i]=nums[i];
//          }
//          for(int i=0;i<nums.length;i++){
//              nums[(i+k)%nums.length]=nums1[i];
//          }
            
        k = k % nums.length;
        if(k == 0 || nums.length < 1) {
            return;
        }
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
            
    }

    public void reverse(int[] nums, int start, int end) {
        int tmp;
        for(int i = start; i < (end + start + 1) / 2; i++){
            tmp = nums[i];
            nums[i] = nums[end + start - i];
            nums[end + start - i] = tmp;
        } 
    }

    public static void main(String[] args) {
        Solution s1 = new Solution();
        int [] nums = {1, 2, 3, 4, 5, 6, 7};
        s1.rotate(nums, 3);
        System.out.println(nums);
    }
}

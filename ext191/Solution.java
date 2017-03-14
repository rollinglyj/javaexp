package ext191;


public class Solution {
     public int hammingWeight(int n) {
        int i, t, res;
        res = 0;
        for(i = 0; i < 32; i++) {
            t = n & 0x01;
            res = res + t;
            n = n >>> 1;    
        }
        return res;
    }

    public static void main(String[] args) {
        Solution s1 = new Solution();
        System.out.println(s1.hammingWeight(11));
    }
}

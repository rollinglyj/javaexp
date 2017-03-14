package ext172;


public class Solution {
    public int trailingZeroes(int n) {
        return n == 0 ? 0 : n / 5 + trailingZeroes(n / 5);
    }

    public static void main(String[] args) {
        Solution s1 = new Solution();
        System.out.println(s1.trailingZeroes(26));
    }
}

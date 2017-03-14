package ext125;

import java.util.*;

public class Solution {
    public boolean isPalindrome(String s) {
        if(s.length() == 0 || s.length() == 1) {
            return true;
        }
        int i = 0, j = s.length() - 1;
        while(i < j) {
            if(!((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z' || (s.charAt(i) >= '0' && s.charAt(i) <= '9')))) {
                i++;
                continue;
            }
            if(!((s.charAt(j) >= 'a' && s.charAt(j) <= 'z') || (s.charAt(j) >= 'A' && s.charAt(j) <= 'Z' || (s.charAt(j) >= '0' && s.charAt(j) <= '9')))) {
                j--;
                continue;
            }
            if((s.charAt(j) == s.charAt(i)) || ((Math.abs(s.charAt(i) - s.charAt(j)) == 32) && ((s.charAt(j) >= 'a' && s.charAt(j) <= 'z') || (s.charAt(j) >= 'A' && s.charAt(j) <= 'Z')) && ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')))) {
                i++;
                j--;
                continue;
            }
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution s1 = new Solution();
        System.out.println(s1.isPalindrome("Zeus was deified, saw Suez."));
    }
}

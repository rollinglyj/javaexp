package ext165;

import java.util.*;

public class Solution {
    public int compareVersion(String version1, String version2) {
        String [] v1 = version1.split("\\.");
        String [] v2 = version2.split("\\.");
        int i = 0;
        int len = v1.length > v2.length ? v2.length : v1.length;
         
        while(i < len) {
            if(compareNum(v1[i], v2[i]) == 1) {
                return 1;
            }
            if(compareNum(v1[i], v2[i]) == -1) {
                return -1;
            }
            if(compareNum(v1[i], v2[i]) == 0) {
                i++;
                continue;
            }
        }
        if(v1.length < v2.length) {
            while(i < v2.length) {
                if(compareNum("0", v2[i])==1) {
                    return 1;
                }
                if(compareNum("0", v2[i])==-1) {
                    return -1;
                }
                if(compareNum("0", v2[i])==0) {
                    i++;
                    continue;
                }
            } 
        }
        if(v1.length > v2.length) {
            while(i < v1.length) {
                if(compareNum(v1[i], "0") == 1) {
                    return 1;
                }
                if(compareNum(v1[i], "0") == -1) {
                    return -1;
                }
                if(compareNum(v1[i], "0") == 0) {
                    i++;
                    continue;
                }
            } 
        }
        return 0;
    }

    public int compareNum(String num1, String num2) {
        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);
        if(n1 > n2) {
            return 1;
        }
        if(n1 < n2) {
            return -1;
        }
        return 0;
    }

    public static void main(String[] args) {
        Solution s1 = new Solution();
        System.out.println(s1.compareVersion("0.0.1", "0.0.1.5"));
    }
}

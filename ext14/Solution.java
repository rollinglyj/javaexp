package ext14;

public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0 || strs[0].length() == 0) {
            return "";
        }
        char[] res = new char[strs[0].length()];
        int flag = 0;
        int i = 0;
        for (i = 0; i < strs[0].length(); i++) {
            for (int j = 0; j < strs.length; j++) {
                if (strs[j].length() <= i) {
                    flag = 1;
                    break;
                }
                if (strs[0].charAt(i) == strs[j].charAt(i)) {
                    continue;
                } else {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                res[i] = strs[0].charAt(i);
            } else {
                break;
            }
        }
        
        String result = new String(res);
        String result1;
        result1 = result.substring(0, i);
        
        return result1;
    }

    public static void main(String[] args) {
        Solution s1 = new Solution();
        String[] strs = {"", "121", "121"};
        System.out.println(s1.longestCommonPrefix(strs) + "end");
    }
}

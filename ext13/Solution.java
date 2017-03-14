package ext13;

public class Solution {
    public int romanToInt(String s) {
        int res = 0;
        int num = 0;
        int lst = 0;
        for(int i = s.length() - 1; i>= 0; i--) {
            switch(s.charAt(i)) {
                case 'I': num = 1;break;
                case 'V': num = 5;break;
                case 'X': num = 10;break;
                case 'L': num = 50;break;
                case 'C': num = 100;break;
                case 'D': num = 500;break;
                case 'M': num = 1000;break;
                default: num=0;
            }
            if(lst > num) {
                res = res - num;
            }
            else {
                res = res + num;
            }
            lst = num;
        }
        return res;
    }

    public static void main(String[] args) {
        Solution s1 = new Solution();
        System.out.println(s1.romanToInt("MCMLXXVI"));
    }
}

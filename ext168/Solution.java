package ext168;


public class Solution {
    public String convertToTitle(int n) {
        StringBuilder sbd1 = new StringBuilder();
        char cnum;
        if(n == 1) {
            return "A";
        }
        //n--;
        
        while( n!= 0) {
            if(n % 26 == 0) {
                cnum = 'Z';
                sbd1.insert(0, cnum);
                n = (n - 1) / 26;
            }
            else {
                cnum = (char) (n % 26 + 'A' - 1);
                sbd1.insert(0, cnum);
                n = n / 26;
            }
            
        }
        return sbd1.toString();   
    }

    public static void main(String[] args) {
        Solution s1 = new Solution();
        System.out.println(s1.convertToTitle(26));
    }
}

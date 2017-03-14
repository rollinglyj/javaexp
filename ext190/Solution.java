package ext190;


public class Solution {
//public int reverseBits(int n) {
//  StringBuilder sbd=new StringBuilder();
//    int t;
//  char a;
//  while(n>0){
//      t=n%2;
//      n=n/2;
//      a=(char) (t+'0');
//      sbd.insert(0, a);
//  }
//  while(sbd.length()<32){
//      sbd.insert(0, '0');
//  }
//  sbd.reverse();
//  t=0;
//  for(int i=0;i<sbd.length();i++){
//      t=t*2;
//      switch( sbd.charAt(i)){
//          case '0':t+=0;break;
//          case '1':t+=1;break;
//      }
//      
//  }
//  
//        return t;
//    }
    public int reverseBits(int n) {
        int i,t,res;
        res = 0;
        for(i = 0; i < 32; i++){
            res = res << 1;
            t = n & 0x01;
            res = res + t;
            n = n >>> 1;    
        }
        return res;
    }

    public static void main(String[] args) {
        Solution s1 = new Solution();
        System.out.println(s1.reverseBits(43261596));
    }
}

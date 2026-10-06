class Solution {
    public int reverse(int x) {
        int ans=0;
       int n=Math.abs(x);
        while(n>0){
            int last=n%10;
             if(ans > Integer.MAX_VALUE / 10 ||
               (ans == Integer.MAX_VALUE / 10 && last > 7)) {
                return 0;
            }
            ans=ans*10+ last;
            n=n/10;
        }
         if(x<0){
           ans=-ans;
         }
        return ans;
    }
}
class Solution {
    public int[] plusOne(int[] arr) {
       int last= arr.length-1;
       for(int i=last;i>=0;i--){
        if(arr[i]<9){
            arr[i]++;
            return arr;
        }
          arr[i]=0;
       }
        
       int[] ans= new int[arr.length+1];
       ans[0]=1;
       return ans;
        
 
    }
}
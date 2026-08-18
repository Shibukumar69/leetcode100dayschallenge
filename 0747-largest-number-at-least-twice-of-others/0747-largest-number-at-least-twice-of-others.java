class Solution {
    public int dominantIndex(int[] nums) {
        int l1=-1;
        int l2=-1;
        int k=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>l1){
                l2=l1;
                l1=nums[i];
                k=i;
            } 
             else if(nums[i] < l1 && l2 < nums[i]){
                l2=nums[i];
             }
        } 
         if(l2*2<=l1){
            return k;
         }
          else return -1;
        
    }
}
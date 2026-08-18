class Solution {
    public int pivotIndex(int[] nums) {
    int rightsum=0;
    for(int i=0;i<nums.length;i++){
        rightsum+=nums[i];
    }
    int leftsum=0;
    for(int j=0;j<nums.length;j++){
        if(leftsum==rightsum-nums[j]){
            return j;
        } else{
            leftsum=leftsum+nums[j];
            rightsum=rightsum-nums[j];
        }
    }
      return -1;
    }
}
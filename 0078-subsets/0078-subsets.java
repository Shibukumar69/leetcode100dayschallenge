class Solution {
    public List<List<Integer>> subsets(int[] nums) {
     List<List<Integer>> ans= new ArrayList<>();
     int index=0;
      sub(nums,index,new ArrayList<>(),ans);
      return ans;
    }
    public void sub(int[] nums,int index, List<Integer> current, List<List<Integer>> ans){
        if(index>=nums.length){
            ans.add(new ArrayList<>(current));
            return ;
        }
         current.add(nums[index]);
         sub(nums,index+1,current,ans);
         current.remove(current.size()-1);
         sub(nums,index+1,current,ans);
    }

}
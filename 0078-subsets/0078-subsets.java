class Solution {
    public List<List<Integer>> subsets(int[] nums) {
     List<List<Integer>> ans= new ArrayList<>();
     List<Integer> current=new ArrayList<>();
     int index=0;
      sub(nums,index,current,ans);
      return ans;
    }
    public void sub(int[] nums,int index, List<Integer> current, List<List<Integer>> ans){
        // base case
        if(index>=nums.length){
            ans.add(new ArrayList<>(current));
            return ;
        }
        // 1 khud se case banaye baki ka recursion karega

        // including
         current.add(nums[index]);
         sub(nums,index+1,current,ans);
          //excluding
         current.remove(current.size()-1);
         sub(nums,index+1,current,ans);
    }

}
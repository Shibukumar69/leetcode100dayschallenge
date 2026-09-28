class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return CreateTree(nums,0,nums.length-1);
    }
    // function for creating the tree
    public TreeNode CreateTree(int []nums,int start,int end){
        if(start>end){
            return null;
        }
        int mid=(start+end)/2;
        TreeNode root= new TreeNode(nums[mid]);
        root.left=CreateTree(nums,start,mid-1);
        root.right=CreateTree(nums,mid+1,end);
        return root;

    }
}
class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        int lefth=height(root.left);
        int righth=height(root.right);
        if(Math.abs(lefth-righth)>1){
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    
    }
     
     public int height(TreeNode root){
         if(root==null){
            return 0;
         }
           int lefth=height(root.left);
           int righth=height(root.right);
           return 1+Math.max(lefth,righth);
     }
}
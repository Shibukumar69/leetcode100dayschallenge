class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
         List<Integer> ans=new ArrayList<>();
            if(root==null){
                return ans;
            }
            Postorder(root,ans);
            return ans;
         
    }
    public void Postorder(TreeNode root,List<Integer> ans){
        if(root==null){
            return;
        }
        Postorder(root.left,ans);
        Postorder(root.right,ans);
        ans.add(root.val);
    }
}
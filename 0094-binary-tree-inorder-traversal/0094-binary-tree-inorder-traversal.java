class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans= new ArrayList<>();
        if(root==null){
            return ans;
        }
        Inorder(root,ans);
        return ans;
    }
    public void Inorder(TreeNode root,List<Integer> ans){
        if(root==null){
            return;
        }
        Inorder(root.left,ans);
        ans.add(root.val);
        Inorder(root.right,ans);
    }
}
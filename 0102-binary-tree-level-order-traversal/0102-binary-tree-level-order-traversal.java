class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {

      List<List<Integer>> ans = new ArrayList<>();
      if(root==null){
        return ans;
      }

     Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(q.size()>0){
            int size=q.size();
              List<Integer> level = new ArrayList<>();
            while(size>0){

            TreeNode front=q.remove();
            level.add(front.val);
            if(front.left!=null){
            q.add(front.left);
            }
            if(front.right!=null){
             q.add(front.right);
            }
            size--;
            }
            ans.add(level);
           

        }
        return ans;
    }
}
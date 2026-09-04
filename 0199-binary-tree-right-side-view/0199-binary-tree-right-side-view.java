class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans= new ArrayList<>();
        if(root==null){
            return ans;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(queue.size()>0){
            int size=queue.size();
            while(size>0){
                          TreeNode front=queue.poll();
            if(front.left!=null){
                queue.offer(front.left);
            }
            if(front.right!=null){
                queue.offer(front.right);
            }
            if(size==1){
                ans.add(front.val);
            }
             size--;
            }

        }
        return ans;
    }
}
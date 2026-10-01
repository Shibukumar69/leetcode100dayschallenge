class Solution {
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> arr=new ArrayList<>();
        Inorder(root,arr);
        // if(arr.size()<k) return -1;
        return arr.get(k-1);
    }


    public void Inorder(TreeNode root, ArrayList<Integer> arr){
       if(root==null) return;
       Inorder(root.left,arr);
       arr.add(root.val);
       Inorder(root.right,arr);

    }
}
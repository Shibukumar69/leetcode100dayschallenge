class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
            int leftheight=height(root.left);
            int rightheight=height(root.right);
            int currentDiameter=leftheight+rightheight;
            int leftDiameter=diameterOfBinaryTree(root.left);
            int rightDiameter=diameterOfBinaryTree(root.right);
            return Math.max(currentDiameter,Math.max(leftDiameter,rightDiameter));
            

        }
    
    static int height(TreeNode root){
        if(root==null){
            return 0;
        }
            int leftheight=height(root.left);
            int rightheight=height(root.right);
            return 1+Math.max(leftheight,rightheight);
    }
}

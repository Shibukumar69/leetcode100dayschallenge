// class Solution {
//     public int diameterOfBinaryTree(TreeNode root) {
//         if(root==null){
//             return 0;
//         }
//             int leftheight=height(root.left);
//             int rightheight=height(root.right);
//             int currentDiameter=leftheight+rightheight;
//             int leftDiameter=diameterOfBinaryTree(root.left);
//             int rightDiameter=diameterOfBinaryTree(root.right);
//             return Math.max(currentDiameter,Math.max(leftDiameter,rightDiameter));
            

//         }
    
//     static int height(TreeNode root){
//         if(root==null){
//             return 0;
//         }
//             int leftheight=height(root.left);
//             int rightheight=height(root.right);
//             return 1+Math.max(leftheight,rightheight);
//     }
// }

class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) return 0;

        int curr = height(root.left) + height(root.right);
        int left = diameterOfBinaryTree(root.left);
        int right = diameterOfBinaryTree(root.right);

        return Math.max(curr, Math.max(left, right));
    }

    int height(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }
}
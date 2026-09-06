class Solution {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if (root == null) {
            return null;
        }

        if (root == p || root == q) {
            return root;
        }

        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        // p aur q alag-alag subtree me hain
        if (left != null && right != null) {
            return root;
        }

        // dono left me hain
        if (left != null) {
            return left;
        }

        // dono right me hain
        if (right != null) {
            return right;
        }

        return null;
    }
}
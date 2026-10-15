class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return root;

        // Agar root node hi delete karna hai
        if (root.val == key) {
            // 0 child
            if (root.left == null && root.right == null) {
                return null;
            }
            // 1 child
            else if (root.left == null) {
                return root.right;
            }
            else if (root.right == null) {
                return root.left;
            }
            // 2 children
            else {
                TreeNode pred = root.left;

                while (pred.right != null) {
                    pred = pred.right;
                }

                root.val = pred.val;
                root.left = deleteNode(root.left, pred.val);
            }
        }

        // Left subtree mein search
        else if (root.val > key) {
            root.left = deleteNode(root.left, key);
        }

        // Right subtree mein search
        else {
            root.right = deleteNode(root.right, key);
        }

        return root;
    }
}
class Solution {
    private int diameter = 0;  // To store the maximum diameter found

    public int diameterOfBinaryTree(TreeNode root) {
        calculateHeight(root);  // Calculate height to update the diameter
        return diameter;        // Return the maximum diameter found
    }

    private int calculateHeight(TreeNode node) {
        if (node == null) {
            return 0;  // Base case: height of null node is 0
        }

        // Recursively find the height of left and right subtrees
        int leftHeight = calculateHeight(node.left);
        int rightHeight = calculateHeight(node.right);

        // Update the diameter: the longest path that goes through this node
        diameter = Math.max(diameter, leftHeight + rightHeight);

        // Return the height of this node
        return 1 + Math.max(leftHeight, rightHeight);
    }
}

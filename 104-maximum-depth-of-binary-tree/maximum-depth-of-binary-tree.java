class Solution {
    public int maxDepth(TreeNode root) {
        TreeNode current = root;
        if(root == null){
            return 0;
        }
        int left = maxDepth(current.left);
        int right = maxDepth(current.right);
        int ans = Math.max(left, right) + 1;
        return ans;
    }
}
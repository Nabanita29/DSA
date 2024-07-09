class Solution {
    public int minDepth(TreeNode root) {
        TreeNode current = root;
        int ans = Integer.MAX_VALUE;
        if(root == null){
            return 0;
        }
        // If left subtree is null go for the right
        if(root.left == null){
            return minDepth(current.right) + 1;
        }
        if(root.right == null){
            return minDepth(current.left) + 1;
        }

        int left = minDepth(current.left); 
        int right = minDepth(current.right);
        ans = 1 + Math.min(left,right);
        return ans;
        
    }
}
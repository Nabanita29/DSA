class Solution {
    public int maxDepth(TreeNode root) {
        int ans = 0;
        TreeNode current = root;
        // Base case
        if(root == null){
            return 0;
        }
        // Keeps going until root is null at which point it returns 0
        // After that point it returns answer
        int left = maxDepth(current.left); 
        int right = maxDepth(current.right);
        ans = 1 + Math.max(left, right);
        return ans;
        
    }
}
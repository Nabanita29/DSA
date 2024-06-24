class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }
        return check(root.left, root.right);
    }
    public boolean check(TreeNode leftNode, TreeNode rightNode){
        if(leftNode == null && rightNode == null){
            return true;
        }
        if(leftNode == null || rightNode == null){
            return false;
        }
        if(leftNode.val != rightNode.val){
            return false;
        }
        return check(leftNode.left , rightNode.right) && check(leftNode.right , rightNode.left);
    }
}
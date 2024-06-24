class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        ArrayList<Integer> result = new ArrayList<>();
        TreeNode current = root;
        while(current != null || !stack.isEmpty()){
            if(current != null){
            stack.push(current);
            current = current.left;
        } else {
            current = stack.pop();
            result.add(current.val);
            current = current.right;
        }}
        
           

        return result;

    }
}

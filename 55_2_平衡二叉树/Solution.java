/**
public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
*/
public class Solution {
    boolean isBalanced = true;
    
    public boolean IsBalanced_Solution(TreeNode root) {
        handle(root);
        return isBalanced;
    }
    
    private int handle(TreeNode root){
        if(root == null || !isBalanced)return 0;
        int left = handle(root.left);
        int right = handle(root.right);
        if(Math.abs(left - right) > 1){
            isBalanced = false;
        }
        return 1 + Math.max(left, right);
    }
}
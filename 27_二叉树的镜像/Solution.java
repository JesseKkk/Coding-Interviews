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
    public void Mirror(TreeNode root) {
        if(root == null)
            return;
        swap(root);
        Mirror(root.left);
        Mirror(root.right);
    }
    
    private void swap(TreeNode root){
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
    }
}
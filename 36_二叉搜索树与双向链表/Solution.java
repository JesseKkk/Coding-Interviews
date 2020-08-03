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
    TreeNode pre = null;
    TreeNode head = null;
    public TreeNode Convert(TreeNode pRootOfTree) {
        inOrder(pRootOfTree);
        return head;
    }
    
    private void inOrder(TreeNode node){
        if(node == null)return;
        inOrder(node.left);
        node.left = pre;
        if(pre != null){
            pre.right = node;
        }
        pre = node;
        if(head == null){
            head = node;
        }
        inOrder(node.right);
    }
}
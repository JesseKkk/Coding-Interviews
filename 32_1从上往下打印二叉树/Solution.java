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
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class Solution {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(root == null)return list;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode tmp = queue.poll();
            list.add(tmp.val);
            if(tmp.left != null){
                queue.offer(tmp.left);
            }
            if(tmp.right != null){
                queue.offer(tmp.right);
            }
        }
        return list;
    }
}
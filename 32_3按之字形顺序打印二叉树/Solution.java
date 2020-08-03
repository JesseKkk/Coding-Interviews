/*
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
    public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if(pRoot == null) return result;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(pRoot);
        boolean reverse = true;
        while(!queue.isEmpty()){
            ArrayList<Integer> list = new ArrayList<Integer>();
            int size = queue.size();
            for(int i = 0; i < size; i++){
                TreeNode tmp = queue.poll();
                if(reverse){
                    list.add(tmp.val);
                }else{
                    list.add(0, tmp.val);
                }
                if(tmp.left != null) queue.offer(tmp.left);
                if(tmp.right != null) queue.offer(tmp.right);
            }
            result.add(list);
            reverse = !reverse;
        }
        return result;
    }

}
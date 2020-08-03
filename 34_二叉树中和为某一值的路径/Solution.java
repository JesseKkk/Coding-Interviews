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

public class Solution {
    ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
    
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {
        backtracking(root, target, new ArrayList<Integer>());
        return result;
    }
    
    private void backtracking(TreeNode node, int target, ArrayList<Integer> path){
        if(node == null) return;
        path.add(node.val);
        target -= node.val;
        if(target == 0 && node.left == null && node.right == null){
            result.add(new ArrayList<Integer>(path));
        }else{
            backtracking(node.left, target, path);
            backtracking(node.right, target, path);
        }
        path.remove(path.size() - 1);
    }
}
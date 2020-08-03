/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
import java.util.HashMap;
import java.util.Map;

public class Solution {
    private Map<Integer, Integer> indexForOrders = new HashMap<>();
    
    public TreeNode reConstructBinaryTree(int[] pre,int[] in) {
        for(int i = 0; i < pre.length; i++){
            indexForOrders.put(in[i], i);
        }
        return reConstructBinaryTree(pre, 0, pre.length - 1, 0);
    }

    private TreeNode reConstructBinaryTree(int[] pre, int preL, int preR, int inL){
        if(preL > preR){
            return null;
        }
        TreeNode root = new TreeNode(pre[preL]);
        int index = indexForOrders.get(root.val);
        int leftSize = index - inL;
        root.left = reConstructBinaryTree(pre, preL+1, preL+leftSize, inL);
        root.right = reConstructBinaryTree(pre, preL + leftSize + 1, preR, inL + leftSize+1);
        return root;
    }
}
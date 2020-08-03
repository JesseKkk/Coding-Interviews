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
public class Solution {
    public String Serialize(TreeNode root) {
        StringBuilder builder = new StringBuilder();
        pre(root, builder);
        return builder.toString();
  }
    private void pre(TreeNode node, StringBuilder builder){
        if (node == null){
            builder.append("#!");
        }else{
            builder.append(node.val + "!");
            pre(node.left, builder);
            pre(node.right, builder);
        }
    }
    
    TreeNode Deserialize(String str) {
       String[] arr = str.split("!");
        return deCode(arr);
    }
    
    int index = -1;
    private TreeNode deCode(String[] arr){
        TreeNode node = null;
        index++;
        if(!arr[index].equals("#")){
            node = new TreeNode(Integer.valueOf(arr[index]));
            node.left= deCode(arr);
            node.right= deCode(arr);
        }
        return node;
    }
}
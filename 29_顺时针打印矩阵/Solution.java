import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> list = new ArrayList<Integer>();
       if(matrix == null || matrix.length == 0 || matrix[0].length == 0)
           return list;
        int up = 0;
        int down = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length -1;
        while(true){
            for(int cols = left; cols <= right; cols++){
                list.add(matrix[up][cols]);
            }
            up++;
            if(up > down){
                break;
            }
            
            for(int rows = up; rows <= down; rows++){
                list.add(matrix[rows][right]);
            }
            right--;
            if(right < left){
                break;
            }
            
            for(int cols = right; cols >= left; cols--){
                list.add(matrix[down][cols]);
            }
            down--;
            if(down < up){
                break;
            }
            
            for(int rows = down; rows >= up; rows--){
                list.add(matrix[rows][left]);
            }
            left++;
            if(left > right){
                break;
            }
        }
        return list;
    }
}
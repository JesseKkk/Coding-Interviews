public class Solution {
    public static final int[][] next = {{1,0},{-1,0},{0,1},{0,-1}};
    private int rows;
    private int cols;
    private int threshold;
    private int[][] digitSum;
    private int cnt;
    
    public int movingCount(int threshold, int rows, int cols)
    {
        this.rows = rows;
        this.cols = cols;
        this.threshold = threshold;
        init();
        boolean[][] mark = new boolean[rows][cols];
        handle(mark, 0, 0);
        return cnt;
    }
    
    private void handle(boolean[][] mark, int r, int c){
        if( r < 0 || r >= rows || c < 0 || c >= cols || mark[r][c]){
            return;
        }
        mark[r][c] = true;
        if(digitSum[r][c] > threshold){
            return;
        }
        cnt++;
        for(int[] n : next){
            handle(mark, r + n[0], c + n[1]);
        }
    }
    
    private void init(){
        int[] digitSumOne = new int[Math.max(rows,cols)];
        for(int i = 0; i < digitSumOne.length; i++){
            int n = i;
            while(n > 0){
                digitSumOne[i] += n%10;
                n /= 10;
            }
        }
        digitSum = new int[rows][cols];
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                digitSum[i][j] = digitSumOne[i] + digitSumOne[j];
            }
        }
    }
}
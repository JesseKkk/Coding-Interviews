public class PrintProbability {

    private static final int maxValue = 6;

    //递归解法
    public void printProbability(int n){
        if (n < 1) return;
        int[] arr = new int[n * 6 - n +1];
        for (int i = 1; i <= maxValue; i++){
            handle(arr, n, n-1, i);
        }
        double allProbability = Math.pow(maxValue, n);
        for (int j = 0; j < arr.length; j++) {
            System.out.println("点数和为"+ (n+j)+"的概率为："+arr[j]/allProbability);
        }
    }

    private void handle(int[] arr, int n, int curN, int sum) {
        if (curN == 0){
            arr[sum-n]++;
            return;
        }
        for (int i = 1; i <= maxValue; i++)
            handle(arr, n, curN-1, sum+i);
    }

    //循环解法
    public void printProbability2(int n){
        int[][] arr = new int[2][n * maxValue + 1];
        int flag = 0;
        for (int i = 1; i <= maxValue; i++){
            arr[0][i] = 1;
        }
        for (int curNum = 2; curNum <= n; curNum++){
            for (int i = 0; i < curNum; i++){
                arr[1-flag][i] = 0;
            }
            for (int i = curNum; i<= curNum * maxValue; i++){
                arr[1-flag][i] = 0;
                for (int j = 1; j <=6 && j <= i; j++){
                    arr[1-flag][i] += arr[flag][i-j];
                }
            }
            flag = 1 - flag;
        }
        double total = Math.pow(maxValue, n);
        for (int i = n; i <= n * maxValue; i++){
            System.out.println("点数和为"+ i +"的概率为："+arr[flag][i]/total);
        }
    }
}
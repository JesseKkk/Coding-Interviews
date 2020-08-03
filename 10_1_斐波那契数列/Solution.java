public class Solution {
    public int Fibonacci(int n) {
        if(n < 2){
            return n;
        }
        int pre1 = 0;
        int pre2 = 1;
        int fib = 0;
        for(int i = 2; i <= n; i++){
            fib = pre2 + pre1;
            pre1 = pre2;
            pre2 = fib;
        }
        return fib;
    }
}
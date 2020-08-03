public class Solution {
    public int[] multiply(int[] A) {
        int n = A.length;
        int[] ret = new int[n];
        for (int i = 0, j = 1; i < n; j *= A[i],i++) {
            ret[i] = j;
        }
        for (int i = n - 1, j = 1; i >= 0; j *= A[i], i--) {
            ret[i] *= j;
        }
        return ret;
    }
}
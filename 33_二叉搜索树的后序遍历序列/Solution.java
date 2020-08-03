public class Solution {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence == null || sequence.length == 0) return false;
        return helpVerify(sequence, 0, sequence.length-1);
    }
    
    private boolean helpVerify(int[] sequence, int left, int right){
        if(left >= right) return true;
        int key = sequence[right];
        int i = 0;
        for(i = left; i< right; i++) {
            if(sequence[i] > key)
                break;
        }
        for(int j = i; j < right; j++) {
            if(sequence[j] < key)
                return false;
        }
        return helpVerify(sequence, left, i-1) && helpVerify(sequence, i, right-1);
    }
}
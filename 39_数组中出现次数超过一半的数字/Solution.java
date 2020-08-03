public class Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        int cnt = 0;
        Integer condidate = null;
        for(int num : array){
            if(cnt == 0){
                condidate = num;
            }
            cnt += (num == condidate) ? 1 : -1;
        }
        cnt = 0;
        for(int k : array){
            if(k == condidate){
                cnt++;
            }
        }
        if(cnt > array.length/2){
            return condidate;
        }else{
            return 0;
        }
    }
}
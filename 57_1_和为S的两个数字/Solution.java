import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        int lo = 0;
        int hi = array.length - 1;
        while(lo < hi){
            int cur = array[lo] + array[hi];
            if(cur == sum){
                return new ArrayList<Integer>(Arrays.asList(array[lo], array[hi]));
            }else if(cur < sum) {
                lo++;
            }else{
                hi--;
            }
        }
        return new ArrayList<Integer>();
    }
}
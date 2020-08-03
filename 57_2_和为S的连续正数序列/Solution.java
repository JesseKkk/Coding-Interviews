import java.util.ArrayList;
public class Solution {
    public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
       ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
        int left = 1;
        int right =  2;
        int total = 3;
        while(right <= sum/2 + 1){
            if(total > sum){
                total -= left;
                left++;
            }else if(total < sum){
                right++;
                total += right;
            }else{
                ArrayList<Integer> list = new ArrayList<Integer>();
                int tmp = left;
                while(tmp <= right){
                    list.add(tmp++);
                }
                ret.add(list);
                total -= left;
                left++;
            }
        }
        return ret;
    }
}
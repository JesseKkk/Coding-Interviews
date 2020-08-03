import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.HashSet;

public class Solution {
    ArrayList<String> ret = new ArrayList<String>();

    public ArrayList<String> Permutation(String str) {
        char[] arr = str.toCharArray();
        permutation(arr, 0, arr.length-1);
        Collections.sort(ret);
        return ret;
    }
    
    private void permutation(char[] arr, int start, int end){
        if(start == end){
            ret.add(String.valueOf(arr));
        }
        Set<Character> set = new HashSet<Character>();
        for(int index = start; index <= end; index++){
            if (!set.contains(arr[index])){
                set.add(arr[index]);
                swap(arr, index, start);
                permutation(arr, start+1, end);
                swap(arr, index, start);
            }
        }
    }
    
    private void swap(char[] arr, int i, int j){
        char tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
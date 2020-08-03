import java.util.ArrayList;
import java.util.Stack;

public class Solution {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        
        if(pushA == null || popA == null || pushA.length != popA.length){
            return false;
        }
        Stack<Integer> tmp = new Stack<>();
        int j = 0;
        for(int i = 0; i < pushA.length; i++){
            tmp.push(pushA[i]);
            while(!tmp.isEmpty() && (tmp.peek() == popA[j])){
                tmp.pop();
                j++;
            }
        }
        return tmp.isEmpty();
        
    }
}
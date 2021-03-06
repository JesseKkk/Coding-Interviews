import java.util.Stack;
import java.lang.Exception;

public class Solution{
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
        stack1.push(node);
    }
    
    public int pop() throws Exception {
        if(stack2.empty()){
            while(!stack1.empty()){
                stack2.push(stack1.pop());
            }
        }
        if(stack2.empty()){
            throw new Exception("queue is empty");
        }
        return stack2.pop();
    }
}
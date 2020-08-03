import java.util.ArrayList;
import java.util.PriorityQueue;

public class Solution {
    public ArrayList<Integer> maxInWindows(int [] num, int size)
    {
        ArrayList<Integer> ret = new ArrayList<Integer>();
        if (size > num.length || size < 1) return ret;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>((o1, o2) -> o2 - o1);
        for (int i = 0; i < size; i++){
            maxHeap.add(num[i]);
        }
        ret.add(maxHeap.peek());
        for(int i = 0, j = i + size; j < num.length; i++, j++) {
            maxHeap.remove(num[i]);
            maxHeap.add(num[j]);
            ret.add(maxHeap.peek());
        }
        return ret;
    }
}
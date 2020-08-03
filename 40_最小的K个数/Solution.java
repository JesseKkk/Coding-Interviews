import java.util.ArrayList;
import java.util.PriorityQueue;

public class Solution {
    //基于快速选择
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        if(k <= 0 || k > input.length){
            return new ArrayList<Integer>();
        }
        quickSelect(input, 0, input.length-1, k);
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int i = 0; i < k; i++){
           result.add(input[i]);
        }
        return result;
    }
    
    private void quickSelect(int[] input, int low, int high, int k){
        int tmp = input[low];
        int i = low;
        int j = high;
        while(i < j){
            while(tmp <= input[j] && i < j){
                j--;
            }
            while(tmp >= input[i] && i < j){
                i++;
            }
            if (i < j){
                swap(input, i, j);
            }
        }
        input[low] = input[i];
        input[i] = tmp;
        if(i+1 < k){
            quickSelect(input, j+1, low, k);
        }else if(i+1 > k){
            quickSelect(input, low, j-1, k);
        }else{
            return;
        }
    }
    
    private void swap(int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    //大顶堆
    public ArrayList<Integer> GetLeastNumbers_Solution(int[] nums, int k) {
        if (k > nums.length || k <= 0)
            return new ArrayList<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((o1, o2) -> o2 - o1);
        for (int num : nums) {
            maxHeap.add(num);
            if (maxHeap.size() > k)
                maxHeap.poll();
        }
        return new ArrayList<>(maxHeap);
    }
}
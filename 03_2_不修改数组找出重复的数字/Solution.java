public class Solution {
    public int duplicateInArray(int[] arr){
        int start = 1;
        int end = arr.length -1;
        while (start <= end){
            int mid = ((end - start)>>1) + start;
            int count = countRange(arr, start, mid);
            if (end == start){
                if (count > 1){
                    return start;
                }else {
                    return -1;
                }
            }
            if (count > (mid - start) + 1){
                end = mid;
            }else {
                start = mid + 1;
            }
        }
        return -1;
    }

    private int countRange(int[] arr, int start, int end) {
        if (arr == null){
            return -1;
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= start && arr[i] <= end){
                ++count;
            }
        }
        return count;
    }
}
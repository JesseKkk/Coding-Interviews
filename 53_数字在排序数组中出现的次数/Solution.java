public class Solution {
    public int GetNumberOfK(int [] array , int k) {
        int first = getFirst(array, k);
        int last = getLast(array, k);
        if(first == last && first == -1){
            return 0;
        }
        return (last - first + 1);
    }
    
    private int getFirst(int[] arr, int k) {
        int min = 0;
        int max = arr.length - 1;
        while(min <= max) {
            int mid = ((max - min)>>1)+min;
            if (arr[mid] > k) {
                max = mid - 1;
            }else if(arr[mid] < k) {
                min = mid + 1;
            }else{
                if(mid > 0 && arr[mid-1]==k){
                    max = mid - 1;
                }else{
                    return mid;
                }
            }
        }
        return -1;
    }
    
    private int getLast(int[] arr, int k) {
        int min = 0;
        int max = arr.length - 1;
        while(min <= max) {
            int mid = ((max - min)>>1)+min;
            if (arr[mid] > k) {
                max = mid - 1;
            }else if(arr[mid] < k) {
                min = mid + 1;
            }else{
                if(mid < arr.length-1 && arr[mid+1]==k){
                    min = mid + 1;
                }else{
                    return mid;
                }
            }
        }
        return -1;
    }
}
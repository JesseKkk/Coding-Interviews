public class Solution {
    public static int getIndex(int[] arr, int target){
        int min = 0;
        int max = arr.length - 1;
        int mid = 0;
        while (min <= max){
            mid = (min + max)>>1;
            if (arr[mid] > target){
                max = mid - 1;
            }else if (arr[mid] < target) {
                min = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
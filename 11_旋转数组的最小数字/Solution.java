public class Solution {
    public int minNumberInRotateArray(int[] array){
        if (array.length == 0){
            return 0;
        }
        int left = 0;
        int right = array.length - 1;
        int mid = 0;
        while (left < right){
            mid = left + (right - left)/2;
            if (array[left] == array[mid] && array[mid] == array[right]){
                return minNumber(array);
            }
            if (array[mid] <= array[right]){
                right = mid;
            }else {
                left = mid + 1;
            }
        }
        return array[left];
    }

    private int minNumber(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i+1]){
                return array[i+1];
            }
        }
        return array[0];
    }
}
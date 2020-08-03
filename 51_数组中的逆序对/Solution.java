public class Solution {
    private int cnt=0;
    private int[] tmpArr;
    
    public int InversePairs(int [] array) {
         if(array == null || array.length <= 1) return -1;
         tmpArr = new int[array.length];
         mergeSort(array, 0, array.length-1);
         return (int)(cnt % 1000000007);
    }
    
    private void mergeSort(int[] arr, int left, int right){
        if(left < right){
            int mid = (left + right)/2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid+1, right);
            merge(arr, left, mid, right);
        }
    }
    
    private void merge(int[] arr, int left, int mid, int right){
        int leftStart = left;
        int rightStart = mid+1;
        int index = left;
        while(leftStart <= mid && rightStart <= right){
            if(arr[leftStart] <= arr[rightStart]){
                tmpArr[index++] = arr[leftStart++];
            }else{
                cnt += mid - leftStart + 1;
                cnt %= 1000000007;
                tmpArr[index++] = arr[rightStart++];
            }
        }
        while(leftStart <= mid){
             tmpArr[index++] = arr[leftStart++];
        }
        while(rightStart <= right) {
            tmpArr[index++] = arr[rightStart++];
        }
        while(left <= right)
            arr[left] = tmpArr[left++];
    }
}
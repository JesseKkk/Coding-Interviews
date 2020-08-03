public class Solution {
    public static void mergeSort(int[] arr, int left, int right, int[] tempArr){
        if (arr == null){
            return;
        }
        if (left < right){
            int mid = (left + right)>>1;
            mergeSort(arr, left, mid, tempArr);
            mergeSort(arr, mid+1, right, tempArr);
            merge(arr, left, mid, right, tempArr);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right, int[] tempArr){
        int leftStart = left;
        int rightStart = mid + 1;
        int tempIndex = left;
        while (leftStart <= mid && rightStart <= right){
            if (arr[leftStart] < arr[rightStart]){
                tempArr[tempIndex++] = arr[leftStart++];
            }else {
                tempArr[tempIndex++] = arr[rightStart++];
            }
        }
        while (leftStart <= mid){
            tempArr[tempIndex++] = arr[leftStart++];
        }
        while (rightStart <= right){
            tempArr[tempIndex++] = arr[rightStart++];
        }
        while (left <= right){
            arr[left] = tempArr[left++];
        }
        System.out.println(Arrays.toString(arr));
    }
}
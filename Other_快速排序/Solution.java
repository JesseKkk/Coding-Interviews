public class Solution {
    public static void quickSort(int[] arr, int left, int right){
        if (left >= right)
            return;
        int i,j,tmp,swap;
        i = left;
        j = right;
        tmp = arr[left];
        while (i < j){
            while (tmp <= arr[j] && i < j){
                j--;
            }
            while (tmp >= arr[i] && i < j){
                i++;
            }
            if (i < j){
                swap = arr[i];
                arr[i] = arr[j];
                arr[j] = swap;
            }
        }
        arr[left] = arr[i];
        arr[i] = tmp;
        quickSort(arr, left, j-1);
        quickSort(arr, j+1, right);

    }
}
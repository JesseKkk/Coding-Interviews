public class Solution {
    public static void selectSort(int[] arr){
        for (int i = 0; i < arr.length - 1; i++){
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]){
                    min = j;
                }
            }
            if (min != i){
                swap(arr, i, min);
            }
        }
    }

    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
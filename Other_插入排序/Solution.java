public class Solution {
    public static void insertSort(int[] arr){
        int length = arr.length;
        int key;
        int j;
        int i;
        for (j=1; j < length; j++){
            key = arr[j];
            i = j - 1;
            while (i >= 0 && arr[i] > key){
                arr[i+1] = arr[i];
                i--;
            }
            arr[i+1] = key;
        }
    }
}
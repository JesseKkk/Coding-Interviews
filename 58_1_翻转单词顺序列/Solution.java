public class Solution {
    public String ReverseSentence(String str) {
        int n = str.length();
        char[] arr = str.toCharArray();
        int i = 0;
        int j = 0;
        while(j <= n) {
           if(j == n || arr[j] == ' '){
               reverse(arr, i, j-1);
               i = j + 1;
           }
           j++;
        }
        reverse(arr, 0, n-1);
        return new String(arr);
    }
    
    private void reverse(char[] arr, int left, int right){
        while(left < right) {
            swap(arr, left++, right--);
        }
    }

    private void swap(char[] arr, int i, int j){
        char t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
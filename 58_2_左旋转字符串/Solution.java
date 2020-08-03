public class Solution {
    public String LeftRotateString(String str,int n) {
        if(n >= str.length()) return str;
        char[] arr = str.toCharArray();
        reverse(arr, 0, n-1);
        reverse(arr, n, str.length()-1);
        reverse(arr, 0, str.length()-1);
        return new String(arr);
        
    }
    
    private void reverse(char[] arr, int i, int j) {
        while(i < j)
            swap(arr, i++, j--);
    }
    
    private void swap(char[] arr, int i, int j) {
        char t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
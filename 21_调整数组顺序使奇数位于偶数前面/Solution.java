public class Solution {
    public void reOrderArray(int [] array) {
        int oddCnt = 0;
        for(int num : array){
            if(!isEven(num)){
                oddCnt++;
            }
        }
        int[] copy = array.clone();
        int i = 0;
        for(int num : copy){
            if(num % 2 == 1){
                array[i++] = num;
            }else{
                array[oddCnt++] = num;
            }
        }
        
    }

    private boolean isEven(int x){
        return x % 2 == 0;
    }
}
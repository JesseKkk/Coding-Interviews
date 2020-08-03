public class Solution {
    public int digitAtIndex(int index){
        if (index < 0)return -1;
        int digits = 1;
        while (true){
            int numbersOfDigits = numberOfDigits(digits);
            int totalNumbersOfDigits = numbersOfDigits * digits;
            if (index < totalNumbersOfDigits){
                return digitAtIndex(index, digits);
            }
            else {
                index = index - totalNumbersOfDigits;
            }
            digits++;
        }
    }
 
    private int numberOfDigits(int digits) {
        if (digits == 1)return 10;
        int count = (int)Math.pow(10, digits-1);
        return count*9;
    }

    private int digitAtIndex(int index, int digits) {
        int number = beginNumber(digits) + index / digits;
        int indexFromRight = digits - index % digits;
        for (int i=1; i < indexFromRight; i++){
            number = number / 10;
        }
        return number % 10;
    }
 
    private int beginNumber(int digits) {
        if (digits == 1){
            return 0;
        }else {
            return (int)Math.pow(10,digits-1);
        }
    }
}
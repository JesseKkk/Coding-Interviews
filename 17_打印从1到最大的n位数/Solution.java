public class Solution {
    public void printToMaxOfNDigits(int n){
        if (n <= 0)
            return;
        char[] number = new char[n];
        handle(number, 0);
    }

    private void handle(char[] number, int cnt){
        if (cnt == number.length){
            printResult(number);
            return;
        }
        for (int i = 0; i < 10; i++){
            number[cnt] = (char)(i + '0');
            handle(number, cnt+1);
        }
    }

    private void printResult(char[] number){
        int index = 0;
        while (index < number.length && number[index] == '0')
            index++;
        while(index < number.length){
            System.out.print(number[index++]);
        }
        System.out.println();
    }
}
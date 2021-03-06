public class Solution {
    public double Power(double base, int exponent) {
        if(exponent == 0)
            return 1;
        if(exponent == 1)
            return base;
        boolean isNegative = false;
        if(exponent < 0){
            exponent = -exponent;
            isNegative = true;
        }
        double result = Power(base * base, exponent/2);
        if(exponent%2 != 0){
            result = base * result;
        }
        return isNegative ? 1/result : result;
  }
}
public class Solution {
    public boolean match(char[] str, char[] pattern)
    {
        if (str == null || pattern == null){
            return false;
        }
        return matchCore(str, 0, pattern, 0);
    }
    
    private boolean matchCore(char[] str, int strIndex, char[] pattern, int patternIndex) {
        if(strIndex == str.length && patternIndex == pattern.length) return true;
        if(strIndex != str.length && patternIndex == pattern.length) return false;
        if(patternIndex+1 < pattern.length && pattern[patternIndex+1] == '*'){
            if(strIndex != str.length && (str[strIndex] == pattern[patternIndex] || pattern[patternIndex] == '.')){
                return matchCore(str, strIndex, pattern, patternIndex+2) ||
                       matchCore(str, strIndex+1, pattern, patternIndex+2) ||
                       matchCore(str, strIndex+1, pattern, patternIndex);
            }else {
                return matchCore(str, strIndex, pattern, patternIndex+2);
            }
        }
        if(strIndex != str.length && (str[strIndex] == pattern[patternIndex] || pattern[patternIndex] == '.')){
            return matchCore(str, strIndex+1, pattern, patternIndex+1);
        }else{
            return false;
        }
    }
}
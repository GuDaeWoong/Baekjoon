import java.util.Arrays;
class Solution {
    public long solution(long n) {
        String str=Long.toString(n);
        char[] chararr=str.toCharArray();
        String strarr = new String(chararr);
        Arrays.sort(chararr);
        
        StringBuilder result = new StringBuilder();
        for (int i = chararr.length - 1; i >= 0; i--) {
            result.append(chararr[i]); 
        }

        return Long.parseLong(result.toString());
    }
}
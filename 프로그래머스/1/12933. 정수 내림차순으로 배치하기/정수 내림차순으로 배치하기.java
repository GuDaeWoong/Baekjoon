import java.util.Arrays;

class Solution {
    public long solution(long n) { //118372

        String str = Long.toString(n);
        char[] charstr = str.toCharArray();
        Arrays.sort(charstr);
        char[] listchar = new char[charstr.length];
        for (int i = 0; i < charstr.length; i++) {
            listchar[i] = charstr[charstr.length - 1 - i];
        }
        String resultString = new String(listchar);

        return Long.parseLong(resultString);
    }
}
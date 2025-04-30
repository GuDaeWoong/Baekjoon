import java.util.Arrays;

class Solution {
    public String solution(String s) {
        char [] a= s.toCharArray();
        Arrays.sort(a);
        StringBuilder answer = new StringBuilder();
        for (int i = a.length - 1; i >= 0; i--) {
            answer.append(a[i]);
        }
        return answer.toString();
    }
}
import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String numStr = Integer.toString(n);
        char [] numArray = numStr.toCharArray();
        for (char num : numArray) {
            answer += (num-'0');
        }
        return answer;
    }
}
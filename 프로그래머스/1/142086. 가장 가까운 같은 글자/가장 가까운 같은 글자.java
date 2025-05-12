import java.util.*;

class Solution {
    public int[] solution(String s) {

        char [] slist = s.toCharArray();
        int[] answer = new int[s.length()];

        Map<Character, Integer> mapList = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            // containsKey 값이 안에 있는지 없는지 확인
            if (mapList.containsKey(slist[i])) {
                answer[i] = i - mapList.get(slist[i]);
            } else {
                answer[i] = -1;
            }
            mapList.put(slist[i], i);
        }
        return answer;
    }
}
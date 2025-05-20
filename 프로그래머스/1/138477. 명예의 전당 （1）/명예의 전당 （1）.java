import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> kList = new ArrayList<>();
        for (int i = 0; i < score.length; i++) {
            kList.add(score[i]);
            Collections.sort(kList);

            if (kList.size()>k) {
                kList.remove(0);
            }
            answer[i]= kList.get(0);
        }
        return answer;
    }
}
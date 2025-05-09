import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        List<Integer> sumList = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1;j < numbers.length; j++) {
                int sum = numbers[i]+numbers[j];
                if (!sumList.contains(sum)) {
                    sumList.add(sum);
                }
            }
        }

        Collections.sort(sumList);

        int[] answer = new int[sumList.size()];
        for (int i = 0; i<sumList.size();i++) {
            answer[i] = sumList.get(i);
        }
        return answer;
    }
}
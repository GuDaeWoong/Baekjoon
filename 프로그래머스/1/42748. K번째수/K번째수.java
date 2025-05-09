import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            int startNum = commands[i][0] - 1;
            int endNum = commands[i][1];
            int n = commands[i][2] - 1;

            int[] arrList = new int[endNum - startNum];
            int index=0;
            for (int j = startNum; j < endNum; j++) {
                arrList[index++]=array[j];

            }
            Arrays.sort(arrList);
            answer[i] = arrList[n];
        }
        return answer;
    }
}
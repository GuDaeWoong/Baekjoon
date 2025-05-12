class Solution {
    public String solution(int[] food) {
        String answer = "";
        for (int i = food[0]; i < food.length; i++) {
            int half= food[i]/2;
            for (int j=0;j<half;j++) {
                answer+=i;
            }
        }
        StringBuilder reverseAnswer =new StringBuilder(answer).reverse();
        answer+=0;
        answer+=reverseAnswer;
        return answer;
    }

}
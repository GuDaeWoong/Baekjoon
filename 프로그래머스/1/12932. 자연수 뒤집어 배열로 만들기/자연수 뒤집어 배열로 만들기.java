class Solution {
    public int[] solution(long n) {
        String numStr = Long.toString(n);
        char [] numArray = numStr.toCharArray();
        int[] answer = new int[numArray.length];
        int numArrayLength=0;
        for (int i = numArray.length-1; i >=0 ; i--) {
            answer[numArrayLength]=(numArray[i]-'0');
            numArrayLength++;
        }
        return answer;
    }
}


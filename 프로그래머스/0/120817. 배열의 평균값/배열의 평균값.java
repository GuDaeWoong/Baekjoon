class Solution {
    public double solution(int[] numbers) {
        int a=0;
        for(int num: numbers){
            a+=num;
        }
        double answer = (double) a/numbers.length;
        return answer;
    }
}
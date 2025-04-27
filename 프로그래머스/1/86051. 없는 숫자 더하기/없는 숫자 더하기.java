class Solution {
    public int solution(int[] numbers) {
        int total=45;
        int numbersSum= 0;
        for (int num:numbers) {
            numbersSum+=num;
        }


        return total-numbersSum;
    }
}
class Solution {
    
    public long solution(int price, int money, int count) {
        long sum = 0;
        
        for (int i =1;i<=count;i++) {
            sum +=(long) i * price;
        }
        long answer = money-sum;
        if (answer < 0) {
            return Math.abs(answer);
        } else {
            return 0;
        }
    }
}
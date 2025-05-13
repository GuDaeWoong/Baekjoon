class Solution {
    public int solution(int num) {
        
        if (num == 1) {
            return 0;
        }

        int count =0;
        long result = num;

        while (count<500) {
            if (result==1) {
                return count;
            } else if (result % 2 == 0) {
                result /= 2;
            } else  {
                result = result * 3 + 1;
            }
            count++;
        }
        return -1;
    }
}
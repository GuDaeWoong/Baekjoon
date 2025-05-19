class Solution {
    public int solution(int left, int right) {

        int result=0;
        for (int i=left;i<=right;i++) {
            int count=0;
            for (int j=1;j<=i;j++) {
                if (i%j==0) {
                    count++;
                }
            }
            if (count % 2 == 0) {
                result += i;
            } else {
                result -= i;
            }
        }
        return result;
    }
}

// class Solution {
//     public int solution(int left, int right) {
//         int answer = 0;
//         int[] d = {1, -1};
        
//         for(int i = left; i <= right; i++){
//             int result = countDivisorsEfficient(i);
//             answer += (i * d[result % 2]);
//         }
        
//         return answer;
//     }
//     public int countDivisorsEfficient(int n) {
//         int count = 0;
//         for (int i = 1; i <= Math.sqrt(n); i++) {
//             if (n % i == 0) {
//                 count++;
//                 if (i * i != n) {
//                     count++;
//                 }
//             }
//         }
//         return count;
//     }
// }
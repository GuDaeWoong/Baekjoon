// class Solution {
//     public long solution(int a, int b) {
//         long answer = 0;
//         if(b>a) {
//             for (int i = a; i <= b; i++) {
//                 answer += i;
//             }
//         }else{
//                 for(int i=b ;i<=a; i++){
//                     answer+=i;
//                 }
//             }
//             return answer;
//         }
//     }

import java.util.stream.LongStream;
class Solution {
    public long solution(int a, int b) {
        if (a == b) {
            return a;
        }
        return LongStream.rangeClosed(Math.min(a, b), Math.max(a, b)).sum();
    }
}
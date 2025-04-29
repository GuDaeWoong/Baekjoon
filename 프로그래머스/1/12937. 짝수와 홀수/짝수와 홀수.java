// class Solution {
//     public String solution(int num) {
//         if(num%2 == 0){
//             return "Even";
//         }else{
//             return "Odd";
//         }
//     }
// }

class Solution {
    public String solution(int num) {
        String [] oddeven = {"Even", "Odd"};
        return oddeven[ Math.abs(num) % 2 ];
    }
}
class Solution {
    public int solution(int n) {
        int result = 0; 
        for (int i = 3; i <= n; i++) { 
            if (n % i == 1) { 
                return result = i; 
            }
        }
        return result; 
    }
}
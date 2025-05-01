class Solution {
    public int[] solution(int n, int m) {
        //최대공약수
        int gcd = 0;
        //최소공배수
        int lcm = 0;
        int max = 0;
        if (n > m) {
            max = n;
        } else {
            max = m;
        }
        for (int i = 1; i <= max; i++) {
            if (n % i == 0 && m % i == 0) {
                gcd = i;
            }
        }
        lcm = (n * m) / gcd;
        return new int[]{gcd, lcm};
    }
}
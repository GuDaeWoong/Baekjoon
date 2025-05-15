class Solution {
    public int solution(int a, int b, int n) {
        int total = 0;
        while (n >= a) {
            int drink = (n/a)*b;
            total += drink;

            n = drink + (n%a);
        }
        return  total;
    }
}
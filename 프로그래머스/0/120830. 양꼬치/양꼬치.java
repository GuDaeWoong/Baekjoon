class Solution {
    public int solution(int n, int k) {
        int lams = 12000 * n;
        int drinks = 2000 * k;
        int freeDrinks = n / 10;
        int total = lams + (drinks - (freeDrinks * 2000));
        return total;
    }
}
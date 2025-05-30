class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {

        int card1Index = 0;
        int card2Index = 0;

        for (String g : goal) {
            if (card1Index < cards1.length && cards1[card1Index].equals(g)) {
                card1Index++; 
            }
            else if (card2Index < cards2.length && cards2[card2Index].equals(g)) {
                card2Index++; 
            }
            else {
                return "No";
            }
        }
        return "Yes";
    }
}
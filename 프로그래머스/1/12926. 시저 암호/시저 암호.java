class Solution {
    public String solution(String s, int n) {
        StringBuilder result = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (Character.isLetter(ch)) {
                char base = Character.isLowerCase(ch) ? 'a' : 'A';
                //  a를 기준으로 계산
                char shift = (char) ((ch - base + n) % 26 + base);
                result.append(shift);
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }
}
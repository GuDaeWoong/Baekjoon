class Solution {
    public int solution(String t, String p) {
        int len = p.length();//길이
        int count = 0;
        for (int i = 0; i <= t.length() - len; i++) {
            long t_re1 = Long.parseLong(t.substring(i, i + len));
            long p_re1 = Long.parseLong(p);
            if (t_re1 <= p_re1) {
                count++;
            }
        }
        return count;
    }
}
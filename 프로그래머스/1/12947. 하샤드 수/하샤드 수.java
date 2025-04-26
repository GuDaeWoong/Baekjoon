class Solution {
    public boolean solution(long x) {
        boolean answer = true;
        String num= Long.toString(x);
        char [] charnum = num.toCharArray();
        int sum=0;
        for (char number : charnum) {
            sum+=number-'0';
        }
        if (x % sum != 0) {
            answer=false;
        }
        return answer;
    }
}
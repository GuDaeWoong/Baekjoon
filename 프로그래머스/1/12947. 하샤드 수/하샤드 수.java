class Solution {
    public boolean solution(int x) {//18
        boolean answer = true;
        String num= Integer.toString(x);
        char [] charnum = num.toCharArray();
        //[1,8]
        
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
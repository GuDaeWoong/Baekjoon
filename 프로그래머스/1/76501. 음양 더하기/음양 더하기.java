class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int [] list = new int[absolutes.length];
        for (int i = 0; i < absolutes.length; i++) {
            if (signs[i]) {
                list[i] = absolutes[i];
            } else {
                list[i] = -absolutes[i];
            }
            }
        int sum=0;
        for (int i=0;i < absolutes.length; i++) {
            sum+=list[i];
            
        }
        return  sum;
    }
}
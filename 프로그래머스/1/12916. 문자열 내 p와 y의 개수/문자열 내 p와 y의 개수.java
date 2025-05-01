class Solution {
    boolean solution(String s) {
        s= s.toLowerCase();
        char [] arr = s.toCharArray();
        int count_p=0;
        int count_y=0;
        for (char i : arr) {
            if (i=='y') {
                count_y++;
            } else if ((i=='p')) {
                count_p++;
            }
        }
        if (count_y==0 && count_p==0) {
            return true;
        } else if (count_y == count_p) {
            return true;
        } else {
            return false;
        }

    }
}
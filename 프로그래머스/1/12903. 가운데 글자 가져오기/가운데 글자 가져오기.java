class Solution {
    public String solution(String s) {
        char [] arr = s.toCharArray();
        int result = arr.length / 2;
        
        if (arr.length % 2 == 0) {
            return new String(arr, result - 1, 2);
        } else {
            return String.valueOf(arr[result]);        }
    }
}
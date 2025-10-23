class Solution {
    public String solution(String my_string) {
        
        char[] arrayList = my_string.toCharArray();
        int n = arrayList.length;
        char[] reversedArray = new char[n];
        
        for (int i=0; i<n ;i++){
            reversedArray[i] = arrayList[n - 1 - i];
        }
        return new String(reversedArray);
    }
}
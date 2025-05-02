// class Solution {
//     public String solution(String s) {
//         char [] arr = s.toCharArray();
//         for (int i=1;i<=arr.length;i++) {
//             if (i % 2 != 0) {
//                 arr[i - 1] = Character.toUpperCase(arr[i - 1]);
//             }
//         }
//         return new String(arr);
//     }
// }

//입력값 〉   " read the explanation carefully "
//기댓값 〉   " ReAd ThE ExPlAnAtIoN CaReFuLlY "


class Solution {
    public String solution(String s) {
        String[] splitList = s.split(" ");
        String resultUpper="";
        for (String list: splitList) {
            for (int i=0;i<list.length();i++) {
                if (i % 2 == 0) {
                    resultUpper += Character.toUpperCase(list.charAt(i));
                } else {
                    resultUpper += Character.toLowerCase( list.charAt(i));
                }
            }
        }
        int sIndex=0;
        int sbIndex = 0;
        String result="";
        while (s.length()>sIndex ) {
            if (Character.isSpaceChar( s.charAt(sIndex))) {
                result += String.valueOf(s.charAt(sIndex++));
            } else if (Character.isUpperCase(resultUpper.charAt(sbIndex))) {
                result += resultUpper.charAt(sbIndex++);
                sIndex++;
            } else {
                result += resultUpper.charAt(sbIndex++);
                sIndex++;
            }
        }
        return result;
    }
}
// " try hello world "
// " Tr Y HeLlO WoRlD "


    class Solution {
        public String[] solution(String[] strings, int n) {
            int strLength = strings.length;

            for (int i = 0; i < strLength - 1; i++) {
                for (int j =0 ; j < strLength - 1 ;j++) {
                    String str1 = strings[j];
                    String str2 = strings[j + 1];

                    char char1 = str1.charAt(n);
                    char char2 = str2.charAt(n);

                    if (char1 > char2) {
                        String temp = strings[j];
                        strings[j] = strings[j + 1];
                        strings[j + 1] = temp;
                    } else if (char1 == char2) {
                        //compareTo()유니코드 기준으로 비교
                        if (str1.compareTo(str2) > 0) {
                            String temp = strings[j];
                            strings[j] = strings[j + 1];
                            strings[j + 1] = temp;
                        }
                    }
                }

            }
            return strings;
        }
}
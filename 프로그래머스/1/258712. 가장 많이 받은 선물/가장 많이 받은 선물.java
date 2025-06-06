import java.util.*;


class Solution {
    public int solution(String[] friends, String[] gifts) {
        int n = friends.length;
        int[][] gCounts = new int[n][n];
        int[] score = new int[n];
        int[] next = new int[n];

        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < friends.length; i++) {
            map.put(friends[i], i);
        }

        for (String gift : gifts) {
            String[] people = gift.split(" ");
            String give = people[0];
            String receive = people[1];
            gCounts[map.get(give)][map.get(receive)]++;
            score[map.get(give)]++;
            score[map.get(receive)]--;
        }
//        0 0 2 0
//        3 0 0 0
//        1 1 0 0
//        1 0 0 0
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int give_i = gCounts[i][j]++;
                int give_j = gCounts[j][i]++;
                if (give_i > give_j) {
                    next[i]++;
                } else if (give_i < give_j) {
                    next[j]++;
                } else {
                    if (score[i] > score[j]) {
                        next[i]++;
                    } else if (score[j] > score[i]) {
                        next[j]++;
                    }
                }
            }
        }
        int max = Integer.MIN_VALUE;// 최대값을 계산해주는 곳에 최소값으로 값을 초기화
        for (int i = 0; i < n; i++) {
            max = Math.max(next[i], max);
        }
        return max;
    }
}


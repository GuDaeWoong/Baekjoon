class Solution {
    public int solution(int[][] sizes) {
        int[][] sort = new int[sizes.length][sizes[0].length];

        for (int i = 0; i < sizes.length; i++) {
            sort[i][0] = Math.max(sizes[i][0], sizes[i][1]); 
            sort[i][1] = Math.min(sizes[i][0], sizes[i][1]); 
        }
        int height = 0;
        int width = 0;
        for (int i = 0; i < sort.length; i++) {
            height = Math.max(height, sort[i][1]);
            width = Math.max(width, sort[i][0]);
        }
        int answer = height * width;
        return answer;
    }
}
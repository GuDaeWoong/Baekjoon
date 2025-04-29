class Solution {
    public int[] solution(int[] arr) {
        if (arr.length <= 1) {
            return new int[]{-1};
        }
        int minValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
            }
        }
        int[] result = new int[arr.length - 1];
        int index = 0;
        for (int num : arr) {
            if (num != minValue) {
                result[index++] = num;
            }
        }

        return result;
    }
}
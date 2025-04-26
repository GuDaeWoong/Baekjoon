import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Solution {
    public List <Integer> solution(int[] arr, int divisor) {
        List <Integer> result = new ArrayList<>();
        for (int num : arr) {
            if (num % divisor == 0) {
                result.add(num);
            }
        }
        if (result.size() == 0) {
            result.add(-1);
        }

        Collections.sort(result);
        return result;
    }
}
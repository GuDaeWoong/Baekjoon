import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int n) {
        int num = n;
        List<Integer> three = new ArrayList<>();
        while (num > 0) {
            three.add(num % 3);
            num /= 3;
        }
        System.out.println(three);
        int sum = 0;
        for (int j=0,i=three.size()-1;i>=0;i--,j++) {
            sum += three.get(j) * Math.pow(3,i);
        }
        return sum;
    }
}
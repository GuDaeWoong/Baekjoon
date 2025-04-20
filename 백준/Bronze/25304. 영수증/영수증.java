import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        int count = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < count; i++) {
            int m_1 = sc.nextInt();
            int c_1 = sc.nextInt();
            sum = sum+m_1*c_1;
        }
        if (money == sum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
 }
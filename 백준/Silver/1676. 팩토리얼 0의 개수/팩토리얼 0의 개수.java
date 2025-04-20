import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int count = 0;

        // 5의 배수, 25의 배수, 125의 배수 등의 개수를 더함
        for (int i = 5; i <= num; i *= 5) {
            count += num / i;
        }

        System.out.print(count);
        scanner.close();
    }
}
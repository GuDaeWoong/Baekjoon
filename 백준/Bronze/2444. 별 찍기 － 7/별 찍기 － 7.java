import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1;i<=n*2-1;i++){
            int k = n-i;
            k = Math.abs(k);

            for (int j = 0; j < k; j++) {
                System.out.print(" ");
            }
            for (int l=0; l<n*2-1-(k*2);l++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
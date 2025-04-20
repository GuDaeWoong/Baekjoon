import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  text = sc.nextLine();
        String [] textarray = text.split(" ");
        int count=0;
        for (String str: textarray) {
            if (!str.isEmpty()) {
                count++;
            }
        }
        System.out.println(count);

    }
}

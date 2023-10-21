import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        sc.close();

        int i = n - (9 * Integer.toString(n).length() - 1);

        while (i <= n) {
            int sum = i;
            int temp = i;
            while (temp > 0) {
                sum += temp % 10;
                temp /= 10;
            }
            if (sum == n) {
                System.out.println(i);
                return;
            }
            i++;
        }
        System.out.println(0);
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = n / 5; i >= 0; i--) {
            int copy = n;
            copy = copy - 5 * i;
            if (copy % 3 == 0) {
                System.out.println(i + copy / 3);
                return;
            }
        }
        System.out.println(-1);
    }
}


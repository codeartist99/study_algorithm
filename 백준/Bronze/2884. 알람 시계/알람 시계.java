import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        short a, b;

        a = sc.nextShort();
        b = sc.nextShort();

        for (int i = 0; i < 45; i++) {
            if (b > 0) {
                b--;
            } else if (b == 0) {
                b = 59;
                if (a > 0) {
                    a--;
                } else if (a == 0) {
                    a = 23;
                }
            }
        }
        System.out.println(a);
        System.out.println(b);
    }
}

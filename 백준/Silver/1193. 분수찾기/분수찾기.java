import java.util.*;

public class Main {
    public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

        int a = 1;
        int b = 1;
        int temp = 1;
        for (int i = 1; i < n; i++) {
            if (temp % 2 == 1) {
                if (a == 1) {
                    b++;
                    temp++;
                } else {
                    a--;
                    b++;
                }
            } else {
                if (b == 1) {
                    a++;
                    temp++;
                } else {
                    a++;
                    b--;
                }
            }
        }
        System.out.printf("%d/%d", a, b);
    }
}
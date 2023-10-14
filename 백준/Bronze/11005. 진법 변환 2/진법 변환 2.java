import java.util.*;

public class Main {
    public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int b = sc.nextInt();

        StringBuilder result = new StringBuilder();
        while (n > 0) {
            int remainder = n % b;
            char temp;
            if (n % b < 10) {
                temp = (char) ('0' + remainder);
            } else {
                temp = (char) (remainder + 'A' - 10);
            }
            result.insert(0, temp);
            n = n / b;
		}
        System.out.println(result.toString());
    }
}

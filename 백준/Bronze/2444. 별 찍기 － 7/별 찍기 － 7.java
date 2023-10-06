import java.util.*;

public class Main {
    public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int length = 2 * n - 1;
		for (int i = 1; i <= n; i++) {
			String stars = "";
			for (int j = 0; j < 2 * i - 1; j++) {
				stars += "*";
			}
			int space = (2 * i - 1 == length) ? 0 : (length - (2 * i - 1)) / 2; 
			if (space != 0) System.out.println(String.format("%" + space + "s%s", " ", stars));
			else System.out.println(String.format("%s", stars));
		}
		for (int i = n - 1; i > 0; i--) {
			String stars = "";
			for (int j = 0; j < 2 * i - 1; j++) {
				stars += "*";
			}
			int space = (length - (2 * i - 1)) / 2; 
			if (space != 0) System.out.println(String.format("%" + space + "s%s", " ", stars));
			else System.out.println(String.format("%s", stars));
		}
	}
}
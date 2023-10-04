import java.util.*;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		int[] baskets = new int[n];
		for (int i = 0; i < n; i++) {
			baskets[i] = i + 1;
		}

		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			for (int j = 0; j < ((b - a + 1) / 2); j++) {
				int temp = baskets[a + j - 1];
				baskets[a + j - 1] = baskets[b - j - 1];
				baskets[b - j - 1] = temp;
			}
		}

		for (int i : baskets) {
			System.out.print(i + " ");
		}
	}
}
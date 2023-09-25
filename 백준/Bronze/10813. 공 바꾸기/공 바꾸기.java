import java.util.*;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		int[] baskets = new int[n]; 

		for (int x = 0; x < n; x++) {
			baskets[x] = x + 1;
		}

		for (int x = 0; x < m; x++) {
			int i = sc.nextInt() - 1;
			int j = sc.nextInt() - 1;

			int temp = baskets[i];
			baskets[i] = baskets[j];
			baskets[j] = temp;
		}
		
		for (int x = 0; x < n; x++) {
			System.out.print(baskets[x]);
			System.out.print(" ");
		}
	}
}
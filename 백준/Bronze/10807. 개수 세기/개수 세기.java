import java.util.*;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arrays = new int[n];
		for (int i = 0; i < n; i++) {
			arrays[i] = sc.nextInt();
		}

		int find = sc.nextInt();

		int result = 0;
		for (int i : arrays) {
			if (i == find) {
				result++;
			}
		}
		System.out.println(result);
	}
}
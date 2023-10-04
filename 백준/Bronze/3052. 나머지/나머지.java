import java.util.*;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean[] arrays = new boolean[42];
		for (int i = 0; i < 10; i++) {
			int n = sc.nextInt();
			arrays[n % 42] = true;
		}

		int result = 0;
		for (int i = 0; i < 42; i++) {
			if (arrays[i]) {
				result++;
			}
		}
		System.out.println(result);
	}
}
import java.util.*;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] numbers = new int[n];
		for (int i = 0; i < n; i++) {
			numbers[i] = sc.nextInt();
		}
		int min = numbers[0];
		int max = numbers[0];
		for (int i : numbers) {
			if (i <= min) {
				min = i;
			} else if (i >= max) {
				max = i;
			}
		}

		System.out.print(min + " ");
		System.out.print(max);
	}
}
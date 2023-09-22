import java.util.*;

public class Main {
    public static void main(String[] args) {
		boolean[] numbers = new boolean[100001];
		
		for (int i = 1; i < 10000; i++) {
			if (d(i) < 10000) {
				numbers[d(i)] = true;
			}
		}

		for (int i = 1; i < 10000; i++) {
			if (!numbers[i]) {
				System.out.println(i);
			}
		}
	}
	public static int d(int x) {
		int result = x;
		while (x > 0) {
			result += x % 10;
			x /= 10;
		}
		return result;
	}
}
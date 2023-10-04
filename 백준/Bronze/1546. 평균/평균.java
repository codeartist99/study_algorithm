import java.util.*;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		float[] scores = new float[n];

		float max = 0;
		for (int i = 0; i < n; i++) {
			scores[i] = sc.nextFloat();
			if (max < scores[i]) {
				max = scores[i];
			}
		}

		float result = 0;
		for (int i = 0; i < n; i++) {
			scores[i] = scores[i]/max*100;
			result += scores[i];
		}

		System.out.println(result / n);
	}
}
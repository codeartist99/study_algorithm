import java.util.*;

public class Main {
    public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);

		char[] n = sc.next().toLowerCase().toCharArray();
		int b = sc.nextInt();

		char[] alphabets = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		
		int result = 0;

		if (b <= 10) {
			for (int i = 0; i < n.length; i++) {
				result += Character.getNumericValue(n[n.length - 1 - i]) * Math.pow(b, i);
			}
		} else {
			for (int i = 0; i < n.length; i++) {
				char current = n[n.length - 1 - i];
				for (int j = 0; j < b; j++) {
					if (j < 10) {
						if (Character.getNumericValue(current) == j) {
							result += Character.getNumericValue(current) * Math.pow(b, i);
						}
					} else {
						if (current == alphabets[j - 10]) {
							result += j * Math.pow(b, i);
						}
					}
				}
			}
		}
		System.out.println(result);

	}
}
import java.util.*;

public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] input = sc.nextLine().split(" ");
		String a = input[0];
		String b = input[1];

		for (int i = a.length() - 1; i >= 0; i--) {
			if (Character.getNumericValue(a.charAt(i)) > Character.getNumericValue(b.charAt(i))) {
				reverse(a);
				break;
			} else if (Character.getNumericValue(a.charAt(i)) < Character.getNumericValue(b.charAt(i))) {
				reverse(b);
				break;
			} else continue;
		}
	}

	private static void reverse(String a) {
		StringBuilder sb = new StringBuilder();
		for (int i = a.length() - 1; i >= 0; i--) {
			sb.append(a.charAt(i));
		}
		System.out.println(sb.toString());
	}
}
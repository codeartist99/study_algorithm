import java.util.*;

public class Main {
    public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);

		String n = sc.next();
		int b = sc.nextInt();

		int result = 0;
		for (int i = 0; i < n.length(); i++) {
			char current = n.charAt(n.length() - 1 - i);
			if (Character.isDigit(current)) {
				result += Character.getNumericValue(current) * Math.pow(b, i);
			} else {
				result += (current - 'A' + 10) * Math.pow(b, i);
			}
		}
		System.out.println(result);
	}
}
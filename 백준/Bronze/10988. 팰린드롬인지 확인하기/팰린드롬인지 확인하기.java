import java.util.*;

public class Main {
    public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();
		for (int i = 0; i < input.length() / 2 + 1; i++) {
			if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
				System.out.println(0);
				return;
			} else {
				if (i == input.length() / 2) System.out.println(1);
			}
		}
	}
}
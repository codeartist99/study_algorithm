import java.util.*;

public class Main {
    public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();

		int result = 0;	
		for (int i = 0; i < input.length(); i++) {
			char firstChar = input.charAt(i);
			if (i + 1 < input.length()) {
				char secondChar = input.charAt(i + 1);
				if (firstChar == 'c' && (secondChar == '=' || secondChar == '-')) i++;
				else if (firstChar == 'd') {
					if (secondChar == '-') i++;
					else if (secondChar == 'z' && i + 2 < input.length()) {
						char thirdChar = input.charAt(i + 2);
						if (thirdChar == '=') i = i + 2;
					}
				} else if (firstChar == 'l' && secondChar == 'j') i++;
				else if (firstChar == 'n' && secondChar == 'j') i++;
				else if (firstChar == 's' && secondChar == '=') i++;
				else if (firstChar == 'z' && secondChar == '=') i++;
			}
			result++;
		}
		System.out.println(result);
	}
}
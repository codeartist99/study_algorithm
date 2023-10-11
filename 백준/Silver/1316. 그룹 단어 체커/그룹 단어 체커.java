import java.util.*;

public class Main {
    public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		char[] alphabets = "abcdefghijklmnopqrstuvwxyz".toCharArray();
		int result = 0;
		for (int i = 0; i < n; i++) {
			String word = sc.next();
			boolean[] isIs = new boolean[alphabets.length];
			boolean wordResult = true;
			for (int j = 0; j < word.length(); j++) {
				for (int k = 0; k < alphabets.length; k++) {
					if (alphabets[k] == word.charAt(j)) {
						if (isIs[k]) {
							if (word.charAt(j) != word.charAt(j - 1)) {
								wordResult = false;
							}
						} else {
							isIs[k] = true;
						}
						break;
					}
				}
				if (!wordResult) break;
			}
			if (wordResult) result++;
		}
		System.out.println(result);
	}
}
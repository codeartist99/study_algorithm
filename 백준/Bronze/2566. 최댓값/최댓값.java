import java.util.*;

public class Main {
    public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		
		int x = 1;
		int y = 1;
		int max = 0;
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				int current = sc.nextInt();
				if (max < current) {
					max = current;
					x = i + 1;
					y = j + 1;
				}
			}
		}

		System.out.println(max);
		System.out.printf("%d %d", x, y);

		sc.close();
	}
}
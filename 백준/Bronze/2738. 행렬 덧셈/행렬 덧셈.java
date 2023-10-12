import java.util.*;

public class Main {
    public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);

		String[] inputNM = sc.nextLine().split(" ");
		int n = Integer.parseInt(inputNM[0]);
		int m = Integer.parseInt(inputNM[1]);

		int[][] a = new int[n][m];
		int[][] b = new int[n][m];

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < n; j++) {
				String[] inputNo = sc.nextLine().split(" ");
				for (int k = 0; k < m; k++) {
					if (i == 0) {
						a[j][k] = Integer.parseInt(inputNo[k]);
					} else {
						b[j][k] = Integer.parseInt(inputNo[k]);
					}
				}
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(a[i][j] + b[i][j] + " ");
			}
			System.out.println();
		}
	}
}
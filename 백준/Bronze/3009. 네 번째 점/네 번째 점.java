import java.util.*;

public class Main {
    public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);

        int[] x = new int[3];
        int[] y = new int[3];
        for (int i = 0; i < 3; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        int w = 0;
        int h = 0;
        if (x[1] == x[2]) w = x[0];
        else if (x[0] == x[2]) w = x[1];
        else if (x[0] == x[1]) w = x[2];

        if (y[1] == y[2]) h = y[0];
        else if (y[0] == y[2]) h = y[1];
        else if (y[0] == y[1]) h = y[2];

        System.out.printf("%d %d", w, h);

        sc.close();
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;

        a = sc.nextByte();
        b = sc.nextByte();
        c = sc.nextByte();

        int[] points = {0, 0, 0, 0, 0, 0};
        points[a - 1] += 1;
        points[b - 1] += 1;
        points[c - 1] += 1;

        int x = 1;
        int y = 1;
        for (int i = 0; i < points.length; i++) {
            if (points[i] >= y) {
                x = i + 1;
                y = points[i];
            }
        }
        if (y == 1) {
            System.out.println(x * 100);
        } else if (y == 2) {
            System.out.println(1000 + (x * 100));
        } else {
            System.out.println(10000 + (x * 1000));
        }
    }
}

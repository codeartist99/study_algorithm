import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = sc.nextInt();
        }
        Arrays.sort(result);
        
        for (int i = 0; i < n; i++) {
            System.out.println(result[i]);
        }
    }
}
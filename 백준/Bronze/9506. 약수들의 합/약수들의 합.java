import java.util.*;

public class Main {
    public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);


        while (true) {
            int n = sc.nextInt();
            if (n == -1) break;
            int sum = 0;
            ArrayList<Integer> noArray = new ArrayList<>();
            StringBuilder sb = new StringBuilder();
            for (int i = 1; i <= n / 2; i++) {
                if (n % i == 0) {
                    sum += i;
                    noArray.add(i);
                }
            }
            if (n == sum) {
                sb.append(n + " = ");
                for (int i : noArray) {
                    sb.append(i + " + ");
                }
                sb.delete(sb.length() - 2, sb.length());
                System.out.println(sb.toString());
            } else {
                System.out.printf("%d is NOT perfect.\n", n);
            }
        }
   }
}
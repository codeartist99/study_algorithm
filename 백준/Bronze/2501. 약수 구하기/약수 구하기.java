import java.util.*;

public class Main {
    public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) result.add(i);
        }
        result.add(n);
        
        if (result.size() >= k) {
            System.out.println(result.get(k - 1));
        } else {
            System.out.println(0);
        }
   }
}
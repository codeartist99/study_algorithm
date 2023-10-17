import java.util.*;

public class Main {
    public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int v = sc.nextInt();

        int result;
        if ((v - b) % (a - b) == 0) result = (v - b) / (a - b);
        else result = (v - b) / (a - b) + 1;
        System.out.println(result);
    }
}
import java.util.*;

public class Main {
    public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);

		float sum = 0;
		float creditSum = 0;
		for (int i = 0; i < 20; i++) {
			String[] subject = sc.nextLine().split(" ");
			if (!subject[2].equals("P")) {
				float credit = Float.parseFloat(subject[1]);
				float grade;
				switch (subject[2]) {
					case "A+" : grade = 4.5f;
								break;
					case "A0" : grade = 4.0f;
								break;
					case "B+" : grade = 3.5f;
								break;
					case "B0" : grade = 3.0f;
								break;
					case "C+" : grade = 2.5f;
								break;
					case "C0" : grade = 2.0f;
								break;
					case "D+" : grade = 1.5f;
								break;
					case "D0" : grade = 1.0f;
								break;
					case "F" : grade = 0f;
							   break;
					default : grade = 0f;
							  break;
				}
				sum += grade * credit;
				creditSum += credit;
			}
		}
		System.out.println(sum / creditSum);
	}
}
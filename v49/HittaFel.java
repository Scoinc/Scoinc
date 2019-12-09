import java.util.Scanner;

public class HittaFel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int number;
		boolean success = false;
		System.out.println("Write an integer");

		while (!success) {
			try {
				number = sc.nextInt();
				System.out.println("The number is " + number);
				success = true;
			} catch (Exception e) {
				System.out.println("Obama snälla rädda mig");
				sc.next();
			}
		}
		System.out.println("Good job");
	}
}

import java.util.Scanner; //Scanner import

public class mondayv37 {

	public static void main(String[] args) {

		int age = 0; // redundant number

		Scanner input = new Scanner(System.in); // Scanner

		System.out.println("hur gammal du?");

		age = input.nextInt(); // läser av svaret in i "age"

		if (age >= 18) {
			System.out.println("myndig man");
		}

		else if (age >= 14 && age <= 18) {
			System.out.println("ung man men moppe");
		}

		else {
			System.out.println("bara ung man");
		}

	}

}
